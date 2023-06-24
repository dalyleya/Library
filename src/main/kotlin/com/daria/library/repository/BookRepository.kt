package com.daria.library.repository

import com.daria.library.entity.BookEntity
import com.daria.library.model.NameOnly
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository


interface BookRepository : CrudRepository<BookEntity, Int> {
    fun findByNameStartsWithIgnoreCaseOrderByName(prefix: String): List<BookEntity>

    fun findAllByOrderByName(): List<NameOnly>

    fun findByOrderByName(pageable: Pageable): List<BookEntity>
}