package com.example.dddsample.category.application

import com.example.dddsample.category.application.dto.CateogoryModel
import com.example.dddsample.category.domain.CategoryReader
import org.springframework.stereotype.Service

@Service
class CategoryApplication(
    private val categoryReader: CategoryReader,
) {
    fun findAll(): List<CateogoryModel> {
        return categoryReader.findAll().map {
            CateogoryModel(
                id = it.id,
                name = it.name,
                createdAt = it.createdAt.toString(),
                updatedAt = it.updatedAt.toString(),
            )
        }
    }
}
