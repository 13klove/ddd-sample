package com.example.dddsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = ["com.example.dddsample"])
class DddSampleApplication

fun main(args: Array<String>) {
    runApplication<DddSampleApplication>(*args)
}
