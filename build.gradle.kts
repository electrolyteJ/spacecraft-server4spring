buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io" ) }
        maven { url = uri("https://repo.spring.io/milestone" ) }
        gradlePluginPortal()
    }
    extra.apply {
        set("kotlinVersion", "1.3.41")
        set("springBootVersion", "2.0.0.M7")
        set("springFrameworkVersion", "5.1.3.RELEASE")
        set("grpcVersion", "1.14.0")
    }
    dependencies {
//        classpath("org.jetbrains.kotlin:kotlin-allopen:1.3.41")
//        classpath("org.jetbrains.kotlin:kotlin-noarg:1.3.41")
    }
}

plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("kapt") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    kotlin("plugin.jpa") version "1.9.25"
    kotlin("plugin.serialization") version "1.9.25"
    id("org.springframework.boot") version "3.4.4"
    id("io.spring.dependency-management") version "1.1.7"
//    id("com.google.protobuf") version "0.9.5"
//    id("de.fuerstenau.buildconfig") version "1.1.8"
//    id("com.bmuschko.docker-remote-api") version "9.4.0"
//    jacoco
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io" ) }
        maven { url = uri("https://repo.spring.io/milestone" ) }
        gradlePluginPortal()
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
    //java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(17)
//    }
//}
//
//kotlin {
//    compilerOptions {
//        freeCompilerArgs.addAll("-Xjsr305=strict")
//    }
//}
}