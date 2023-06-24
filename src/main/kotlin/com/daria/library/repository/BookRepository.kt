package com.daria.library.repository

import com.daria.library.entity.BookEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository


interface BookRepository : CrudRepository<BookEntity, Int> {
    fun findByNameStartsWithIgnoreCaseOrderByName(prefix: String): List<BookEntity>

    fun findAllByAuthor(author: String): List<BookEntity>

    fun findByOrderByName(pageable: Pageable): List<BookEntity>
}