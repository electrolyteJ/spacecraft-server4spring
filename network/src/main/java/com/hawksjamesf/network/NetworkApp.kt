package com.hawksjamesf.network

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: jf.chen
 * @since: Dec/18/2018  Tue
 */
fun main(args: Array<String>) {
//    runApplication<App4Kotlin>(*args)
    SpringApplication.run(NetworkApp::class.java, *args)
}

@SpringBootApplication
class NetworkApp {

}