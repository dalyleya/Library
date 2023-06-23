package com.daria.library.service.impl

import com.daria.library.dto.BookDTO
import com.daria.library.dto.SubscriberDTO
import com.daria.library.entity.BookEntity
import com.daria.library.entity.SubscriberEntity
import com.daria.library.repository.BookRepository
import com.daria.library.repository.SubscriberRepository
import com.daria.library.service.SubscriberService
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class SubscriberServiceImpl(
    private val subscriberRepository: SubscriberRepository
) : SubscriberService {

    private val pageSize = 2

    override fun getAll(pageIndex: Int): List<SubscriberDTO> {
        return subscriberRepository.findAllByOrderByName(PageRequest.of(pageIndex, pageSize)).map { it.toDTO() }
    }

    private fun SubscriberEntity.toDTO(): SubscriberDTO =
        SubscriberDTO(this.id, this.name)


}