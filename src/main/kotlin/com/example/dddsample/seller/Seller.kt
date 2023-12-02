package com.example.dddsample.seller

import jakarta.persistence.*

@Entity
class Seller(
    val sellerId: String,
    password: String,
    company: Company
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: SellerPkId = 0

    var password: String = password
        private set

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "name", column = Column(name = "company_name")),
        AttributeOverride(name = "number", column = Column(name = "company_number"))
    )
    var company: Company = company
}

typealias SellerPkId = Long