package com.example.demo.spring.image

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableBatchProcessing
@SpringBootApplication
class DemoSpringImageApplication

fun main(args: Array<String>) {
    runApplication<DemoSpringImageApplication>(*args)
}
