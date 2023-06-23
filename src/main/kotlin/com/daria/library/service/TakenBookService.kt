package com.daria.library.service

import com.daria.library.dto.BookDTO

interface TakenBookService {
    fun getBooksBySubscriberName(name: String): List<String>

    fun findMostPopularBooks(): List<BookDTO>
}