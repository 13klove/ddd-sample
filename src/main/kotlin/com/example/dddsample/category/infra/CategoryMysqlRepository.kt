package com.example.dddsample.category.infra

import com.example.dddsample.category.domain.Category
import com.example.dddsample.category.domain.CategoryId
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryMysqlRepository : JpaRepository<Category, CategoryId> {

    fun findByName(name: String): Category?
}
