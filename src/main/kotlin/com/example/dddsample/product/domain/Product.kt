package com.example.dddsample.product.domain

import jakarta.persistence.CollectionTable
import jakarta.persistence.Column
import jakarta.persistence.ElementCollection
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import java.time.Instant

@Entity
class Product(
    name: String,
    description: String,
    price: Long,
    stock: Int,
    status: ProductStatus,
    categoryIds: MutableList<Long>,
    productFiles: MutableList<ProductFile>,
    sellerId: String,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: ProductId = 0

    var name: String = name
        private set
    var description: String = description
        private set
    var price: Long = price
        private set
    var stock: Int = stock
        private set

    @Enumerated(EnumType.STRING)
    var status: ProductStatus = status
        private set

    @ElementCollection
    @CollectionTable(name = "product_category_mapping", joinColumns = [JoinColumn(name = "product_id")])
    @Column(name = "category_id")
    var categoryIds: MutableList<Long> = categoryIds
        private set

    @ElementCollection
    @CollectionTable(name = "product_file", joinColumns = [JoinColumn(name = "product_id")])
    var productFiles: MutableList<ProductFile> = productFiles
        private set

    var sellerId: String = sellerId
        private set

    val createdAt: Instant = Instant.now()
    var updatedAt: Instant = Instant.now()
        private set

    fun updateName(name: String) {
        this.name = name
    }

    fun updateCategoryIds(categoryIds: MutableList<Long>) {
        this.categoryIds = categoryIds
    }

    fun addFile(file: ProductFile) {
        this.productFiles.add(file)
    }

    fun removeFile(fileId: ProductFileId) {
        this.productFiles.removeIf { it.id == fileId }
    }
}

typealias ProductId = Long
