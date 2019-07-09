package com.novemio.android.core.utils.result

sealed class RequestError {
	data class UnknownError(val t: Throwable) : RequestError()
	data class NoInternetError(val t: Throwable) : RequestError()
	data class HttpError(val code: Int, val message: String) : RequestError()
	data class InternalServerError(val message: String) : RequestError()
}