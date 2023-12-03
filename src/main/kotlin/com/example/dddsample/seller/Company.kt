package com.example.dddsample.seller

import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded

@Embeddable
class Company(
    val name: String,
    val number: String,
    address: Address,
) {

    @Embedded
    var address: Address = address
        private set
}
