package com.daria.library.entity

import jakarta.persistence.*


@Entity
@Table(name = "books")

class BookEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    val name: String = "",

    val author: String = "",

    @Column(name = "total_count")
    var totalCount: Int = 0,

    @Column(name = "taken_count")
    var takenNumber: Int = 0,

    @OneToMany(mappedBy = "book")
    val takenBooks: Set<TakenBookEntity>
)
