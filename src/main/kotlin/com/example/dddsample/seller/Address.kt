package com.example.dddsample.seller

import jakarta.persistence.Embeddable

@Embeddable
class Address(
    val address: String,
)
