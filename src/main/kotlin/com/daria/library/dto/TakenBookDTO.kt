package com.daria.library.dto

import java.util.Date

data class TakenBookDTO(
    val book: BookDTO,
    val userOwned: UserDTO,
    val dateOwned: Date,
    var isReturned: Boolean
)
