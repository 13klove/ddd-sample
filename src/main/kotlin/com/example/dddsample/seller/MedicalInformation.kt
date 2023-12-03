package com.example.dddsample.seller

import jakarta.persistence.Embeddable

@Embeddable
class MedicalInformation(
    val bloodType: String,
)
