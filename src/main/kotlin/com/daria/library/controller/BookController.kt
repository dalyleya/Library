package com.daria.library.controller

import com.daria.library.entities.BookDTO
import com.daria.library.service.BookService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/books")

class BookController(
    private val bookService: BookService
) {
    @GetMapping
    fun getAll(): List<BookDTO> = bookService.getAll()
}