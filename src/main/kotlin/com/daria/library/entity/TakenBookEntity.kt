package com.daria.library.entity

import com.daria.library.dto.BookDTO
import com.daria.library.dto.SubscriberDTO
import jakarta.persistence.*
import java.util.*
@Entity
@Table(name = "taken_books")
class TakenBookEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @ManyToOne
    @JoinColumn(name = "book_id")
    val book: BookEntity,

    @ManyToOne
    @JoinColumn(name = "subscriber_id")
    val subscriberOwned: SubscriberEntity,

    //TODO Parse from DB Date to Kotlin Date
    @Column(name = "date_owned")
    val dateOwned: Date,

    @Column(name = "is_returned")
    var isReturned: Boolean
)