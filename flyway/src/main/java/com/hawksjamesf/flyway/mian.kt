package com.hawksjamesf.flyway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

fun main(args: Array<String>) {
    SpringApplication.run(FlywayApp::class.java)
}

@SpringBootApplication
class FlywayApp {

}