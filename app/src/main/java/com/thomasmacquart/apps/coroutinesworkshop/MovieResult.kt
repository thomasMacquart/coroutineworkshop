package com.thomasmacquart.apps.coroutinesworkshop

import com.squareup.moshi.Json

data class MovieResult(
    @Json(name = "Title")
    var name : String? = null
)
