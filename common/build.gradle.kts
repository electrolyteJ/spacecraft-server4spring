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
val springBootVersion = "2.0.0.M7"
val springFrameworkVersion = "5.1.3.RELEASE"
val grpcVersion = "1.14.0"
dependencies {
//    testCompile group: 'junit', name: 'junit', version: '4.12'
    //spring boot start
    api("org.springframework.boot:spring-boot:$springBootVersion")
    api("com.alibaba:fastjson:1.2.54")
//    api 'javax.servlet:servlet-api:2.5'


    api("joda-time:joda-time:2.10")
    /**
     * mvc
     */
//    implementation "org.springframework.boot:spring-boot-starter-data-freemarker:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-data-groovy-templates:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-mustache:$springBootVersion"
    api("org.springframework.boot:spring-boot-starter-tomcat:1.5.7.RELEASE")
    api("org.springframework.boot:spring-boot-starter-thymeleaf:$springBootVersion")
    api("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    api("org.webjars:react:16.5.2")
    api("org.webjars.npm:react:16.8.5")
    api("org.webjars.npm:js-tokens:3.0.2")
    api("org.webjars.npm:react-dom:16.8.5")
    api("org.webjars.bower:babel:5.8.38")
    api("org.webjars:bootstrap:4.3.1")
    api("org.webjars:jquery:3.4.0")
    api("org.webjars:webjars-locator:0.30")

    /**
     * ===============================monitor start================================
     */
//    implementation "org.springframework.boot:spring-boot-starter-log4j2:$springBootVersion"
    api("org.springframework.boot:spring-boot-starter-logging:$springBootVersion")
    /**
     * ===============================monitor end================================
     */
    /**
     * ===============================io start================================
     */
    api("org.springframework.boot:spring-boot-starter-batch:$springBootVersion")
    api("com.squareup.okio:okio:2.3.0")
    /**
     * ===============================io end================================
     */

    /**
     * ===============================serialization start================================
     */
//    api("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.11.1")

    //》》》》》》》》json

    //api 'com.google.code.gson:gson:2.8.2'


    api("com.alibaba:fastjson:1.1.71.android")

    api("com.squareup.moshi:moshi:1.8.0")
    api("com.squareup.moshi:moshi-adapters:1.8.0")
    api("com.squareup.moshi:moshi-kotlin:1.8.0")
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.8.0")

    //》》》》》》protobuf
    //api 'com.google.protobuf:protobuf-lite:3.0.1'

    /**
     * ===============================serialization end================================
     */

}
