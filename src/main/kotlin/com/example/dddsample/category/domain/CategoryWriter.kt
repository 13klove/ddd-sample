package com.example.dddsample.category.domain

interface CategoryWriter {

    fun create(name: String)

    fun update(id: CategoryId, name: String)

    fun delete(id: CategoryId)
}
