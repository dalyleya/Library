package com.daria.library.controller

import com.daria.library.dto.BookDTO
import com.daria.library.service.BookService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
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

    /**
     * Create a new book and return its id
     */
    //Why does it return 415 Unsupported Media Type in Postman?
    @PostMapping
    fun create(@RequestBody bookDTO: BookDTO): Int =
        bookService.create(bookDTO)
    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @RequestBody bookDTO: BookDTO)=
        bookService.update(id, bookDTO)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) =
        bookService.delete(id)
}