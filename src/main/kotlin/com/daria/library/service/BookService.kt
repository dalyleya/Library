package com.daria.library.service

import com.daria.library.dto.BookDTO

interface BookService {
    fun getAll(pageIndex: Int): List<BookDTO>

    fun getById(id: Int): BookDTO
    fun search(prefix: String): List<BookDTO>
    fun create(bookDTO: BookDTO): Int
    fun update(id: Int, bookDTO: BookDTO)
    fun delete(id: Int)
}