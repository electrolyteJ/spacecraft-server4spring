package com.electrolytej.spacecraft.storage

import org.springframework.boot.SpringApplication
fun main(args: Array<String>) {
//    runApplication<App4Kotlin>(*args)
    SpringApplication.run(StorageConfiguration::class.java,*args)
}