package com.daria.library.controller

import com.daria.library.dto.BookDTO
import com.daria.library.dto.SubscriberDTO
import com.daria.library.service.BookService
import com.daria.library.service.SubscriberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/subscribers")
class SubscriberController(
    private val subscriberService: SubscriberService
) {
    @GetMapping
    fun getAll(@RequestParam("page") pageIndex: Int): List<SubscriberDTO> =
        subscriberService.getAll(pageIndex)
}