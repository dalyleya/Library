package com.daria.library.service

import com.daria.library.entities.BookDTO

interface BookService {
    fun getAll(): List<BookDTO>
}