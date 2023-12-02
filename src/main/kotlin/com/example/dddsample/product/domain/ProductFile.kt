package com.example.dddsample.product.domain

import jakarta.persistence.*
import java.time.Instant
import java.util.*

@Embeddable
@Access(AccessType.FIELD)
class ProductFile(
    val url: String,
    val displayName: String,
    val name: String = UUID.randomUUID().toString(),
    val size: Long,
    @Enumerated(EnumType.STRING)
    val type: ProductFileType
) {
    val id: ProductFileId? = null
    val createdAt: Instant = Instant.now()
    val updatedAt: Instant = Instant.now()
}

typealias ProductFileId = Long