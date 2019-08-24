package com.hawksjamesf.spacecraft.config;

import com.hawksjamesf.storage.StorageConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(StorageConfiguration.class)
public class MainAppConfiguration extends SpringBootServletInitializer {

}
