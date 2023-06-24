package com.daria.library.service

import com.daria.library.dto.BookDTO

interface BookService {
    fun getAll(pageIndex: Int): List<BookDTO>

//    fun findByName(name: String): BookDTO?
    fun getById(id: Int): BookDTO
    fun search(prefix: String): List<BookDTO>
}