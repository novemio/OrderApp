package com.novemio.android.core.utils.result

sealed class SealedResult<out T> {
	
	data class OnSuccess<out T>(val data: T) : SealedResult<T>()
	data class OnError<out T>(val error: RequestError) : SealedResult<T>()
	
}