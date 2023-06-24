package com.daria.library.controller

import com.daria.library.dto.BookDTO
import com.daria.library.service.BookService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/books")

class BookController(
    private val bookService: BookService
) {
    @GetMapping
    fun getAll(@RequestParam("page") pageIndex: Int): List<BookDTO> =
        bookService.getAll(pageIndex)

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Int): BookDTO =
        bookService.getById(id)

    @GetMapping("/search")
    fun searchBooks(@RequestParam("prefix") prefix: String): List<BookDTO> =
        bookService.search(prefix)
}