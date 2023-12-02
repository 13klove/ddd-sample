package com.example.dddsample.seller

import jakarta.persistence.Embeddable

@Embeddable
class Company(
    val name: String,
    val number: String,
)
