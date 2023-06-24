package com.daria.library.dto

data class BookDTO(val id : Int? = null,
                   val name : String,
                   val author : String,
                   var totalCount : Int,
                   var takenNumber : Int? = null)
