//enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        maven(uri("$rootDir/repo"))
        mavenLocal()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://repo.spring.io/milestone") }
        maven("https://s01.oss.sonatype.org/content/repositories/public/")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/google/")
        maven("https://artifact.bytedance.com/repository/byteX/")
        maven("https://artifact.bytedance.com/repository/pangle")
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
//
dependencyResolutionManagement {
    repositories {
        maven(uri("$rootDir/repo"))
        mavenLocal()
        maven { url = uri("https://repo.spring.io/milestone") }
        maven("https://s01.oss.sonatype.org/content/repositories/public/")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://jitpack.io")
        maven("https://artifact.bytedance.com/repository/byteX/")
        maven("https://artifact.bytedance.com/repository/pangle")
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}
include(":app")
include(":common")
//include(":flyway")

