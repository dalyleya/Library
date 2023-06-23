package com.daria.library.service

import com.daria.library.dto.BookDTO
import com.daria.library.dto.SubscriberDTO

interface SubscriberService {
    fun getAll(pageIndex : Int): List<SubscriberDTO>
}