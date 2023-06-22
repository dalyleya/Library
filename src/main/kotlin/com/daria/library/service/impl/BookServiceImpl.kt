package com.daria.library.service.impl

import com.daria.library.dto.BookDTO
import com.daria.library.entity.BookEntity
import com.daria.library.repository.BookRepository
import com.daria.library.service.BookService
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class BookServiceImpl(private val bookRepository: BookRepository) : BookService {

    private val pageSize = 2
    override fun getAll(pageIndex : Int): List<BookDTO> {
        return bookRepository.findByOrderByName(PageRequest.of(pageIndex, pageSize)).map { it.toDTO() }
    }

    private fun BookEntity.toDTO(): BookDTO =
        BookDTO(this.id, this.name, this.author, this.totalCount, this.takenNumber)

}