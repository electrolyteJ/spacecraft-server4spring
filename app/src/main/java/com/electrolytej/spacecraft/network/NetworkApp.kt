package com.electrolytej.spacecraft.network

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

fun main(args: Array<String>) {
//    runApplication<App4Kotlin>(*args)
    SpringApplication.run(NetworkApp::class.java, *args)
}

@SpringBootApplication
class NetworkApp {

}