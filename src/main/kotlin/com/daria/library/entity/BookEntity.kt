package com.daria.library.entity

import jakarta.persistence.*


@Entity
@Table(name = "books")
// why I am having 500 error when I try to get data? I am using postman to get “
// http://localhost:8080/books” and I am getting 500 error. I am using postman to get

class BookEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val name: String = "",
    val author: String = "",
    @Column(name = "total_count")
    var totalCount: Int = 0,
    @Column(name = "taken_count")
    var takenNumber: Int = 0
)
