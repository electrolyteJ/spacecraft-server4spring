package com.hawksjamesf.storage.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.alibaba.druid.support.http.ResourceServlet;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;

/**
 * filters:
 * StatFilter
 * WallFilter
 * ConfigFilter
 * EncodingConvertFilter
 * Slf4jLogFilter
 * Log4jFilter
 * Log4j2Filter
 * CommonsLogFilter
 */
@Configuration
public class DruidConfig {


    //配置多数据源
    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource.druid.one")
    public DataSource dataSourceOne() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.two")
    public DataSource dataSourceTwo() {
        return DruidDataSourceBuilder.create().build();
    }

//    //配置druid监控，
//    //1.管理后台的servlet
//    @Bean
//    public ServletRegistrationBean statViewServlet() {
//        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
//        HashMap<String, String> parameters = new HashMap<>();
//        parameters.put(ResourceServlet.PARAM_NAME_USERNAME, "admin");
//        parameters.put(ResourceServlet.PARAM_NAME_PASSWORD, "123456");
//        parameters.put(ResourceServlet.PARAM_NAME_ALLOW, "");
////        parameters.put(ResourceServlet.PARAM_NAME_DENY,"192.10.130.23");
//        bean.setInitParameters(parameters);
//        return bean;
//    }
//
//    //2.监控的filter
//    @Bean
//    public FilterRegistrationBean webStateFilter() {
//        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>(new WebStatFilter());
//        HashMap<String, String> parameters = new HashMap<>();
//        parameters.put(WebStatFilter.PARAM_NAME_EXCLUSIONS, "*.js,*.css,/druid/*");
//        bean.setInitParameters(parameters);
//        bean.setUrlPatterns(Arrays.asList("/*"));
//        return bean;
//    }

}
