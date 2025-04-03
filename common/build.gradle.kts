plugins {
    id("java-library")
    kotlin("jvm")
    kotlin("kapt")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    kotlin("plugin.serialization")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}
dependencies {
//    testCompile group: 'junit', name: 'junit', version: '4.12'

    /**
     * ===============================monitor start================================
     */
//    implementation "org.springframework.boot:spring-boot-starter-log4j2:$springBootVersion"
//    api("org.springframework.boot:spring-boot-starter-logging:$springBootVersion")
    /**
     * ===============================monitor end================================
     */
    /**
     * ===============================io start================================
     */
//    api("org.springframework.boot:spring-boot-starter-batch:$springBootVersion")
//    api("com.squareup.okio:okio:2.3.0")
    /**
     * ===============================io end================================
     */

    /**
     * ===============================serialization start================================
     */
//    api("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.11.1")

    //》》》》》》》》json

    //api 'com.google.code.gson:gson:2.8.2'

    api("com.alibaba:fastjson:1.2.54")
    api("com.alibaba:fastjson:1.1.71.android")

//    api("com.squareup.moshi:moshi:1.8.0")
//    api("com.squareup.moshi:moshi-adapters:1.8.0")
//    api("com.squareup.moshi:moshi-kotlin:1.8.0")
//    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.8.0")

    //》》》》》》protobuf
    //api 'com.google.protobuf:protobuf-lite:3.0.1'

    /**
     * ===============================serialization end================================
     */

}
