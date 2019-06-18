package com.thomasmacquart.apps.coroutinesworkshop

sealed class NetworkResult<out T: Any> {
    data class onSuccess<out T: Any>(val data : T) : NetworkResult<T>()
    data class Failed(val error: String) : NetworkResult<Nothing>()
}