package com.daria.library.entity

import jakarta.persistence.*

@Entity
@Table(name = "subscribers")
class SubscriberEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    val name: String,

    @OneToMany(mappedBy = "subscriberOwned")
    val takenBooks: Set<TakenBookEntity>
)