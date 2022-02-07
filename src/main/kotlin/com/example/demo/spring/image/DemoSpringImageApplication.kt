package com.example.demo.spring.image

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.ApplicationPidFileWriter
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSpringImageApplication

fun main(args: Array<String>) {
    runApplication<DemoSpringImageApplication>(*args) {
        addListeners(ApplicationPidFileWriter())
    }
}
