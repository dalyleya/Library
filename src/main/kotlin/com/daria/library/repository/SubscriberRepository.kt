package com.daria.library.repository

import com.daria.library.entity.BookEntity
import com.daria.library.entity.SubscriberEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository

interface SubscriberRepository : CrudRepository<SubscriberEntity, Int> {
    fun findByName(name: String): SubscriberEntity?

    fun findAllByOrderByName(pageable: Pageable): List<SubscriberEntity>

}