package com.example.dddsample.product.domain

import jakarta.persistence.*
import java.time.Instant


@Entity
class Product(
    name: String,
    description: String,
    price: Long,
    stock: Int,
    status: ProductStatus,
    categoryIds: Set<Long>
) {

    @Id
    @GeneratedValue
    val id: Long = 0

    var name: String = name
    var description: String = description
    var price: Long = price
    var stock: Int = stock
    @Enumerated(EnumType.STRING)
    var status: ProductStatus = status

    @ElementCollection
    @CollectionTable(name = "product_category_mapping", joinColumns = [JoinColumn(name = "product_id")])
    var categoryIds: Set<Long> = categoryIds


    val createdAt: Instant = Instant.now()
    var updatedAt: Instant = Instant.now()


}