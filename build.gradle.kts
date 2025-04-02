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

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io" ) }
        maven { url = uri("https://repo.spring.io/milestone" ) }
        gradlePluginPortal()
    }
}