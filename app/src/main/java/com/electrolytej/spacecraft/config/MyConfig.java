package com.electrolytej.spacecraft.config;

import com.electrolytej.spacecraft.service.MyService;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public HttpMessageConverters custConverters() {
        return new HttpMessageConverters();
    }

    @Bean
    public MyService custService() {
        return new MyService();
    }

}
