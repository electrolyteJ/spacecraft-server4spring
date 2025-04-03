import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.kotlin.jpa)
    alias(libs.plugins.kotlin.serialization)
    id("org.springframework.boot") version "3.4.4"
    id("io.spring.dependency-management") version "1.1.7"
//    id("com.google.protobuf") version "0.9.5"
//    id("de.fuerstenau.buildconfig") version "1.1.8"
//    id("com.bmuschko.docker-remote-api") version "9.4.0"
//    jacoco
}

allprojects {
    tasks.withType<Test> {
        useJUnitPlatform()
    }
    tasks.withType<KotlinCompile> {
        compilerOptions {
            freeCompilerArgs.addAll("-Xjsr305=strict")
        }
    }
    tasks.withType<JavaCompile> {
//        toolchain {
//            languageVersion = JavaLanguageVersion.of(21)
//        }
    }
}