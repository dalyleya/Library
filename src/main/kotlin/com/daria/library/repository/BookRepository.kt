package com.daria.library.repository

import com.daria.library.entity.BookEntity
import org.springframework.context.annotation.Bean
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository


interface BookRepository : CrudRepository<BookEntity, Int> {
    fun findByName(name: String): BookEntity?

    fun findAllByAuthor(author: String): List<BookEntity>

    fun findByOrderByName(pageable: Pageable): List<BookEntity>
}