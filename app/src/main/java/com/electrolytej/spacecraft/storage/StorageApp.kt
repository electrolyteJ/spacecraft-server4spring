package com.electrolytej.spacecraft.storage

import org.springframework.boot.SpringApplication
/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: jf.chen
 * @since: Dec/18/2018  Tue
 */
fun main(args: Array<String>) {
//    runApplication<App4Kotlin>(*args)
    SpringApplication.run(StorageConfiguration::class.java,*args)
}