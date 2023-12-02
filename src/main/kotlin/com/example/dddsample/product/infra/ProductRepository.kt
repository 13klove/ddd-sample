package com.example.dddsample.product.infra

import com.example.dddsample.product.domain.Product
import com.example.dddsample.product.domain.ProductId
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, ProductId> {
}