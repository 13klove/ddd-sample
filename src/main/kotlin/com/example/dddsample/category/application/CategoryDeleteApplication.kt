package com.example.dddsample.category.application

import com.example.dddsample.category.domain.CategoryWriter
import com.example.dddsample.product.domain.ProductReader
import org.springframework.stereotype.Service

@Service
class CategoryDeleteApplication(
    private val categoryWriter: CategoryWriter,
    private val productReader: ProductReader,
) {

    fun delete(id: Long) {
        if (productReader.existByCategoryId(categoryId = id)) {
            throw IllegalArgumentException("해당 카테고리에 상품이 존재합니다.")
        }
        categoryWriter.delete(id)
    }
}
