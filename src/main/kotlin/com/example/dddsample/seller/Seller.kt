package com.example.dddsample.seller

import jakarta.persistence.AttributeOverride
import jakarta.persistence.AttributeOverrides
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.PrimaryKeyJoinColumn
import jakarta.persistence.SecondaryTable
import jakarta.persistence.SecondaryTables

@Entity
@SecondaryTables(
    SecondaryTable(name = "medical_information", pkJoinColumns = [PrimaryKeyJoinColumn(name = "seller_id")]),
)
class Seller(
    val sellerId: String,
    name: String,
    password: String,
    company: Company,
    medicalInformation: MedicalInformation,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: SellerPkId = 0

    var password: String = password
        private set

    var name: String = name
        private set

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "name", column = Column(name = "company_name")),
        AttributeOverride(name = "number", column = Column(name = "company_number")),
        AttributeOverride(name = "address.address", column = Column(name = "company_address")),
    )
    var company: Company = company

    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "bloodType", column = Column(name = "blood_type")),
    )
    var medicalInformation: MedicalInformation = medicalInformation
        private set
}

typealias SellerPkId = Long
