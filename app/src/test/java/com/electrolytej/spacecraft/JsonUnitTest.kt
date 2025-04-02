package com.electrolytej.spacecraft

import com.squareup.moshi.JsonReader
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import junit.framework.TestCase
import okio.buffer
import okio.source
import java.io.InputStream


/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: hawks.jamesf
 * @since: Aug/13/2019  Tue
 */
class JsonUnitTest : TestCase() {

    lateinit var inputStream: InputStream

    override fun setUp() {
        super.setUp()

        inputStream = ClassLoader.getSystemResourceAsStream("daily.json")
    }

    fun testMoshi() {//只能使用java 不支持kotlin data class
        val moshi = Moshi.Builder()
//                .add(HttpUrl::class.java, URLTypeAdapter())
//                .add(URLTypeAdapter2())
                .build()

        val adapter = moshi.adapter(Bean::class.java)
        val jsonReader = JsonReader.of(inputStream.source().buffer())
        jsonReader.isLenient = true
        val githubApiForMoShi = adapter.fromJson(jsonReader)

    }

    fun testMoshiKotlon() {
        val moshi = Moshi.Builder()
//                .add(HttpUrl::class.java, URLTypeAdapter())
//                .add(URLTypeAdapter2())
                .add(KotlinJsonAdapterFactory())
                .build()

        val adapter = moshi.adapter(Bean::class.java)
        val jsonReader = JsonReader.of(inputStream.source().buffer())
        jsonReader.isLenient = true
        val githubApiForMoShi = adapter.fromJson(jsonReader)

    }

    fun testKotlinSerializer() {

    }


}


