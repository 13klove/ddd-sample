package com.example.dddsample.category.infra

import com.example.dddsample.category.domain.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long> {
}