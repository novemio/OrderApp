package com.novemio.android.core.utils

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.io.ByteArrayOutputStream
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun EditText.asString() =
	this.text.toString()

fun Date.asString(pattern: String = "dd. MMM yyyy", locale: Locale = Locale.getDefault()): String =
	SimpleDateFormat(pattern, locale).format(this)

fun Fragment.showToast(message: String) =
	Toast.makeText(this.activity, message, Toast.LENGTH_SHORT).show()

fun ViewGroup.setGoneVisibiity(visibility: Boolean) =
	if (visibility) this.visibility = View.VISIBLE else this.visibility = View.GONE

fun ViewGroup.setHiddenVisibilty(visibility: Boolean) =
	if (visibility) this.visibility = View.VISIBLE else this.visibility = View.INVISIBLE

fun Float.asString() =
	String.format("%.2f", this) + "$"

fun String.asDate(pattern: String = "dd. MMM yyyy", locale: Locale = Locale.getDefault()) =
	SimpleDateFormat(pattern, locale).parse(this)

fun String.compressBase64(): String {
	Base64.decode(this.toByteArray(), Base64.DEFAULT).also {
		BitmapFactory.decodeByteArray(it, 0, it.size, BitmapFactory.Options().apply { inPurgeable = true }).run {
			if (height <= 200 && width <= 200) return this@compressBase64
			Bitmap.createScaledBitmap(this, 200, 200, false)
			ByteArrayOutputStream().also { baos ->
				compress(Bitmap.CompressFormat.PNG, 100, baos)
				return Base64.encodeToString(baos.toByteArray(), Base64.NO_WRAP)
			}
		}
	}
}
