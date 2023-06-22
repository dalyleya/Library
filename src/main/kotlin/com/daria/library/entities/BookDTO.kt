package com.daria.library.entities

data class BookDTO(val id : Int,
                   val name : String,
                   val author : String,
                   var totalCount : Int,
                   var takenNumber : Int)
