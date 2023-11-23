package com.example.dddsample.category.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.Instant

@Entity
class Category(
    name: String
) {

    @Id
    @GeneratedValue
    val id: Long = 0

    var name: String = name
        protected set

    val createdAt: Instant = Instant.now()
    var updatedAt: Instant = Instant.now()
        protected set

    fun updateName(name: String) {
        this.name = name
        this.updatedAt = updatedAt
    }
}