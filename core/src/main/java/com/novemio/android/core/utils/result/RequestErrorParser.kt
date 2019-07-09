package com.novemio.android.core.utils.result

import com.novemio.android.core.utils.result.RequestError.HttpError
import com.novemio.android.core.utils.result.RequestError.InternalServerError
import com.novemio.android.core.utils.result.RequestError.NoInternetError
import com.novemio.android.core.utils.result.RequestError.UnknownError

import retrofit2.HttpException
import java.net.ConnectException
import java.net.UnknownHostException

object RequestErrorParser {
	fun parse(exception: Throwable): RequestError =
		
		when (exception) {
			is HttpException -> if (exception.code() == 500) InternalServerError(exception.message())
			else HttpError(exception.code(), exception.message())
			is UnknownHostException -> NoInternetError(exception)
			is ConnectException -> NoInternetError(exception)
			else -> UnknownError(exception)
		}
	
}