package naming

import com.android.build.gradle.api.ApplicationVariant
import com.android.build.gradle.internal.api.ApkVariantOutputImpl
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Created by novemio on 7/16/19.
 */

object FormatAppName {
	
	fun format(variant: ApplicationVariant) {
		variant.outputs.forEach { output ->
			val project = "BaseApp"
			val SEPARATOR = "_"
			val flavor = variant.productFlavors[0].name
			val buildType = variant.buildType.name
			val version = variant.versionName
			val date = LocalDateTime.now()
			val formatter = DateTimeFormatter.ofPattern("dd.MM.yy__HH_mm")
			val formattedDate = "date_" + date.format(formatter)
			
			val newApkName =
				project + SEPARATOR +
					flavor + SEPARATOR +
					buildType + SEPARATOR +
					version + SEPARATOR +
					formattedDate + ".apk"
			
			(output as ApkVariantOutputImpl).outputFileName = newApkName
		}
	}
	
}