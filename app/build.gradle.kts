plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.kotlin.jpa)
    alias(libs.plugins.kotlin.serialization)
//    alias(libs.plugins.kotlin.allopen)
    id("org.springframework.boot")
    id("io.spring.dependency-management")
//    id("com.google.protobuf") version "0.9.5"
//    id("de.fuerstenau.buildconfig") version "1.1.8"
//    id("com.bmuschko.docker-remote-api") version "9.4.0"
//    jacoco
}


val springBootVersion = "3.4.4"
val springFrameworkVersion = "5.1.3.RELEASE"
val grpcVersion = "1.14.0"
//protobuf {
//    protoc {
//        // You still need protoc like in the non-Android case
//        artifact = 'com.google.protobuf:protoc:3.7.1'
////        path = '/usr/local/Cellar/protobuf/3.7.1'
//    }
//    plugins {
//        javalite {
//            // The codegen for lite comes as a separate artifact
//            artifact = 'com.google.protobuf:protoc-gen-javalite:3.0.0'
//        }
//        grpc {
//            artifact = 'io.grpc:protoc-gen-grpc-java:1.0.0-pre2'
////            artifact = "io.grpc:protoc-gen-grpc-java:${rootProject.ext.grpcVersion}"
//        }
//    }
//    generateProtoTasks {
//        all().each { task ->
//            task.builtins {
//                // In most cases you don't need the full Java output
//                // if you use the lite output.
//                remove java
//            }
//            task.plugins {
//                javalite {}
//                grpc {
//                    // Options added to --grpc_out
//                    option "lite"
//                }
//            }
//        }
//    }
//}


//apply plugin: "com.bmuschko.docker-remote-api"
//docker {
//    registryCredentials {
//        (username, password) = getKeyStoreProperties(['dockerHubUsername', 'dockerHubPassword'])
//        println("${username} / ${password}")
//    }
//}
//import com.bmuschko.gradle.docker.tasks.image.*
//
//task dockerfile(type: Dockerfile) {
//    from 'openjdk:8'
//    maintainer 'hawks jamesf'
//    exposePort 8080
//    addFile "${bootJar.archiveName}", '.'
//    entryPoint 'java', '-jar', "${bootJar.archiveName}"
////    instruction { "HEALTHCHECK --interval=5s CMD curl -I --fail http://localhost:8080/actuator/health || exit 1" }
//}
//
//task copyBootJarToDockerImageDirectory(type: Copy) {
//    dependsOn bootJar
//    from bootJar.archivePath
//    into dockerfile.destFile.parentFile
//}
//
//
//task buildImage(type: DockerBuildImage) {
//    dependsOn dockerfile, copyBootJarToDockerImageDirectory, check
//    inputDir dockerfile.destFile.parentFile
//    tag = "electrolytej/spacecraft-server:${project.version}"
//}
//
//task pushImage(type: DockerPushImage) {
//    dependsOn buildImage
//    conventionMapping.imageName = { buildImage.getTag() }
//}

//buildConfig {

    // Settings

//    packageName = "com.electrolytej.spacecraft"
    // Fields

    // Note: Provide a 'jwtSigningKey' project property containing a 512-bit base64 encoded string in case you want to customize the JWT signing key
//    buildConfigField("String", "JWT_SIGNING_KEY", project.findProperty("jwtSigningKey") ?: "KkYtSmFOZFJnVWtYbjJyNXU4eC9BP0QoRytLYlBlU2hWbVlxM3M2djl5JEImRSlIQE1jUWZUalduWnI0dTd3IQ==")
//    buildConfigField("String", "env_jdbc_driver", project.findProperty("jwtSigningKey") ?: "KkYtSmFOZFJnVWtYbjJyNXU4eC9BP0QoRytLYlBlU2hWbVlxM3M2djl5JEImRSlIQE1jUWZUalduWnI0dTd3IQ==")
//    buildConfigField("String", "env_jdbc_url", project.findProperty("jwtSigningKey") ?: "KkYtSmFOZFJnVWtYbjJyNXU4eC9BP0QoRytLYlBlU2hWbVlxM3M2djl5JEImRSlIQE1jUWZUalduWnI0dTd3IQ==")
//    buildConfigField("String", "env_jdbc_username", project.findProperty("jwtSigningKey") ?: "KkYtSmFOZFJnVWtYbjJyNXU4eC9BP0QoRytLYlBlU2hWbVlxM3M2djl5JEImRSlIQE1jUWZUalduWnI0dTd3IQ==")
//    buildConfigField("String", "env_jdbc_password", "123456")
//}
springBoot {
    mainClassName = "com.electrolytej.spacecraft.App"
}
bootJar {
    mainClassName = "com.electrolytej.spacecraft.App"
}
//configurations.each { c ->
//    c.resolutionStrategy.dependencySubstitution.all { DependencySubstitution dependency ->
//        if (dependency.requested.group == 'org.webjars.npm') {
//            dependency.useTarget 'org.webjars.npm:js-tokens:3.0.2'
//        }
//
//    }
//}

dependencies {
//    implementation(fileTree(include: ['*.jar'], dir: 'libs'))
//    implementation(project(":common"))
    api("org.springframework.boot:spring-boot:$springBootVersion")
    /**
     * loader
     */
    implementation("org.springframework.boot:spring-boot-loader:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-loader-tools:$springBootVersion")

    /**
     * ops
     */
//    implementation "org.springframework.boot:spring-boot-starter-actuator:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-actuator-docs:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-activemq:$springBootVersion"
//
//    implementation "org.springframework.boot:spring-boot-starter-amqp:$springBootVersion"
//    implementation("org.springframework.boot:spring-boot-starter-aop:$springBootVersion")
//    implementation("org.springframework.boot:spring-boot-starter-artemis:$springBootVersion")

    /**
     * others
     */
//    implementation "org.springframework.boot:spring-boot-starter-webmvc:$springBootVersion"
    implementation("org.springframework.boot:spring-boot-starter-webflux:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-web-services:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-websocket:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-hateoas:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-data-rest:$springBootVersion")
    runtimeOnly("org.springframework.boot:spring-boot-devtools:$springBootVersion")
//    implementation("org.springframework.boot:spring-boot-starter-security:$springBootVersion")
//    implementation "org.springframework.boot:spring-boot-starter-mail:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-mobile:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-social-facebook:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-social-linkedin:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-social-twitter:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-validation:$springBootVersion"
//
//
//    implementation "org.springframework.boot:spring-boot-starter-jersey:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-jetty:$springBootVersion"
//
//    implementation "org.springframework.boot:spring-boot-starter-jooq:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-jta-atomikos:$springBootVersion"
//    implementation "org.springframework.boot:spring-boot-starter-jta-narayana:$springBootVersion"
////
//    implementation "org.springframework.boot:spring-boot-starter:$springBootVersion"
//    
//    implementation("org.springframework.boot:spring-boot-starter-cache:$springBootVersion")
//    implementation("org.springframework.boot:spring-boot-starter-cloud-connectors:$springBootVersion")

    //security
//    implementation("org.springframework.security:spring-security-web:$springFrameworkVersion")
//    implementation("org.springframework.security:spring-security-config:$springFrameworkVersion")
//    implementation("org.springframework.security:spring-security-cas:$springFrameworkVersion")
//    api "org.springframework:spring-context:$springFrameworkVersion"
//    api "org.springframework:spring-beans:$springFrameworkVersion"
//    api "org.springframework:spring-webmvc:$springFrameworkVersion"
//    api "org.springframework:spring-jdbc:$springFrameworkVersion"
//    api "org.springframework:spring-aspects:$springFrameworkVersion"
//    api "org.springframework:spring-context-support:$springFrameworkVersion"
//    testCompile "org.springframework:spring-test:$springFrameworkVersion"
    //spring end
    api("com.h2database:h2:1.4.196")
    api("io.jsonwebtoken:jjwt:0.9.0")
    api("javax.annotation:javax.annotation-api:1.3.1")

    /**
     * no sql数据库连接
     */
//    api("org.springframework.boot:spring-boot-starter-data-cassandra:$springBootVersion")
//    api("org.springframework.boot:spring-boot-starter-data-cassandra-reactive:$springBootVersion")
//    api("org.springframework.boot:spring-boot-starter-data-couchbase:$springBootVersion")
//    api("org.springframework.boot:spring-boot-starter-data-couchbase-reactive:$springBootVersion")
//    api("org.springframework.boot:spring-boot-starter-data-elasticsearch:$springBootVersion")
//    api "org.springframework.boot:spring-boot-starter-data-mongodb:$springBootVersion"
//    api "org.springframework.boot:spring-boot-starter-data-mongodb-reactive:$springBootVersion"
//    api "org.springframework.boot:spring-boot-starter-data-neo4j:$springBootVersion"
    api("org.springframework.boot:spring-boot-starter-data-redis:$springBootVersion")
    api("org.springframework.boot:spring-boot-starter-data-redis-reactive:$springBootVersion")
//    api "org.springframework.boot:spring-boot-starter-data-solr:$springBootVersion"
    /**
     * sql数据库连接
     */
    api("org.springframework.boot:spring-boot-starter-data-ldap:$springBootVersion")
    api("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
//    api "org.springframework.boot:spring-boot-starter-data-jdbc:$springBootVersion"
    api("org.springframework.boot:spring-boot-starter-jdbc:$springBootVersion")
    api("mysql:mysql-connector-java:8.0.17")
    api("com.alibaba:druid-spring-boot-starter:1.1.17")
    api("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.0.1")

    /**
     * configuration
     */
    api("org.springframework.boot:spring-boot-configuration-processor:$springBootVersion")
    api("org.springframework.boot:spring-boot-autoconfigure:$springBootVersion")
    api("org.springframework.boot:spring-boot-configuration-metadata:$springBootVersion")

    /**
     * test
     */
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
    testImplementation("org.springframework.boot:spring-boot-test:$springBootVersion")
    testImplementation("org.springframework.boot:spring-boot-test-autoconfigure:$springBootVersion")
    testImplementation("org.springframework.boot:spring-boot-junit-runners:$springBootVersion")
    testImplementation("junit:junit:4.12")

    //    api 'javax.servlet:servlet-api:2.5'
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
    api("joda-time:joda-time:2.10")

    /**
     * network
     */
    api("io.springfox:springfox-swagger2:2.9.2")
    api("io.springfox:springfox-swagger-ui:2.9.2")
    //    api 'com.google.protobuf:protobuf-javalite:3.7.0'
    api("com.google.protobuf:protobuf-lite:3.0.0")
//    api("com.squareup.moshi:moshi:1.8.0")
//    api 'com.squareup.moshi:moshi-adapters:1.8.0'
//    api("com.squareup.moshi:moshi-kotlin:1.8.0")
//    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.8.0")
    ///non-Android platform
    api("io.grpc:grpc-netty-shaded:${grpcVersion}")
    api("io.grpc:grpc-protobuf:${grpcVersion}")
    api("io.grpc:grpc-stub:${grpcVersion}")
    //rpc框架
    // https://mvnrepository.com/artifact/com.alibaba/dubbo
//    compile group: 'com.alibaba', name: 'dubbo', version: '2.5.3'

}


