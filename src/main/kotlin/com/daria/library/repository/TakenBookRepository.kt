package com.daria.library.repository

import com.daria.library.entity.BookEntity
import com.daria.library.entity.TakenBookEntity
import org.springframework.data.repository.CrudRepository

interface TakenBookRepository : CrudRepository<TakenBookEntity, Int> {

    fun findBySubscriberOwnedName(name: String): List<TakenBookEntity>

}