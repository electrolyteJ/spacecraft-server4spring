package com.electrolytej.spacecraft

import org.springframework.boot.SpringApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

fun main(args: Array<String>) {
//    runApplication<App4Kotlin>(*args)
    SpringApplication.run(App4Kotlin::class.java,*args)
}

class App4Kotlin {
    fun routerFuc(): RouterFunction<ServerResponse> = router {
    }
}