package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinExampleProjectApplication

fun main(args: Array<String>) {
    runApplication<KotlinExampleProjectApplication>(*args)
}

