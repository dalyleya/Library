package com.daria.library.service.impl

import com.daria.library.dto.BookDTO
import com.daria.library.entity.BookEntity
import com.daria.library.exception.BookNotFoundException
import com.daria.library.repository.BookRepository
import com.daria.library.service.BookService
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class BookServiceImpl(private val bookRepository: BookRepository) : BookService {

    private val pageSize = 2
    override fun getAll(pageIndex: Int): List<BookDTO> {
        return bookRepository.findByOrderByName(PageRequest.of(pageIndex, pageSize)).map { it.toDTO() }
    }

    override fun getById(id: Int): BookDTO {
        return bookRepository.findByIdOrNull(id)?.toDTO()
            ?: throw BookNotFoundException(id)
    }

    override fun search(prefix: String): List<BookDTO> {
        return bookRepository.findByNameStartsWithIgnoreCaseOrderByName(prefix)
            .map { it.toDTO() }
    }

    override fun create(bookDTO: BookDTO): Int {
        return bookRepository.save(bookDTO.toEntity()).id
    }

    override fun update(id: Int, bookDTO: BookDTO) {
        val existingBook = bookRepository.findByIdOrNull(id)
            ?: throw BookNotFoundException(id)
        existingBook.name = bookDTO.name
        existingBook.author = bookDTO.author
        existingBook.totalCount = bookDTO.totalCount
        existingBook.takenNumber = bookDTO.takenNumber
        bookRepository.save(existingBook)
    }

    override fun delete(id: Int) {
        val existingBook = bookRepository.findByIdOrNull(id)
            ?: throw BookNotFoundException(id)
        bookRepository.deleteById(existingBook.id)
    }

    private fun BookEntity.toDTO(): BookDTO =
        BookDTO(this.id, this.name, this.author, this.totalCount, this.takenNumber)

    private fun BookDTO.toEntity(): BookEntity =
        BookEntity(name = this.name, author = this.author, totalCount = this.totalCount)

}