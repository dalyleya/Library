package com.daria.library.service

import com.daria.library.dto.BookDTO

interface BookService {
    fun getAll(pageIndex : Int): List<BookDTO>
}