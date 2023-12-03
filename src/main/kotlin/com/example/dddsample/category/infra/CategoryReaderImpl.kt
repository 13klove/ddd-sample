package com.example.dddsample.category.infra

import com.example.dddsample.category.domain.Category
import com.example.dddsample.category.domain.CategoryReader
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional(readOnly = true)
class CategoryReaderImpl(
    private val categoryMysqlRepository: CategoryMysqlRepository,
) : CategoryReader {

    override fun findAll(): List<Category> {
        return categoryMysqlRepository.findAll()
    }
}
