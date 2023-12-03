package com.example.dddsample.category.infra

import com.example.dddsample.category.domain.Category
import com.example.dddsample.category.domain.CategoryId
import com.example.dddsample.category.domain.CategoryWriter
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional
class CategoryWriterImpl(
    private val categoryMysqlRepository: CategoryMysqlRepository,
) : CategoryWriter {

    override fun create(name: String) {
        checkCategoryName(name)
        val category = Category(name = name)
        categoryMysqlRepository.save(category)
    }

    private fun checkCategoryName(name: String) {
        categoryMysqlRepository.findByName(name)?.let {
            throw IllegalArgumentException("이미 존재하는 카테고리입니다.")
        }
    }

    override fun update(id: CategoryId, name: String) {
        checkCategoryName(name)
        val category = getCategoryOrThrow(id = id)
        category.updateName(name)
        categoryMysqlRepository.save(category)
    }

    override fun delete(id: CategoryId) {
        val category = getCategoryOrThrow(id = id)
        categoryMysqlRepository.delete(category)
    }

    private fun getCategoryOrThrow(id: CategoryId) = (
        categoryMysqlRepository.findByIdOrNull(id)
            ?: throw NoSuchElementException("존재하지 않는 카테고리입니다.")
        )
}
