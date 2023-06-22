package com.daria.library.service.impl

import com.daria.library.entities.BookDTO
import com.daria.library.service.BookService
import org.springframework.stereotype.Service

@Service
class BookServiceImpl : BookService {
    override fun getAll(): List<BookDTO> {

//        TODO("Just a mock as for now")

        return listOf(
            BookDTO(1, "Eho Labirinths", "Max Frei", 1, 0),
            BookDTO(2, "Folk of the forest", "Lesia Ukrainka", 2, 0),
        )
    }
}