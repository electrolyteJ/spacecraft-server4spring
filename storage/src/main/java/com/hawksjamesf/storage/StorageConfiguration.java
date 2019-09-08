package com.hawksjamesf.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.ResourceUtils;

@SpringBootApplication
@MapperScan(value = "com.hawksjamesf.storage.dao")
@PropertySource(ResourceUtils.CLASSPATH_URL_PREFIX + "application-storage-dev.properties")
//can be overridden by application.properties
public class StorageConfiguration {

}