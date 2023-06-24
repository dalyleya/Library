package com.daria.library.exception

import org.springframework.http.HttpStatus

class BookNotFoundException(bookId : Int): BaseException(
    httpStatus = HttpStatus.NOT_FOUND,
    apiError = ApiError(
        errorCode = "book.not.found",
        descriptiod = "Book not found with id: $bookId"
    )
) {
}