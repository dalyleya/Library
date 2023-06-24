package com.daria.library.exception

data class ApiError(
    val errorCode : String, // book.not.found
    val descriptiod: String
)
