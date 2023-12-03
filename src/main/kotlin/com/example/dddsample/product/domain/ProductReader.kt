package com.example.dddsample.product.domain

interface ProductReader {

    fun existByCategoryId(categoryId: Long): Boolean
}
