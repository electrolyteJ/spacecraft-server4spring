package com.electrolytej.spacecraft.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc //不接管SpringMvc
@Configuration
//@ComponentScan({"org.baeldung.web"})
public class SpringMvc implements WebMvcConfigurer {
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        messageConverters.add(createXmlHttpMessageConverter());
//        messageConverters.add(new MappingJackson2HttpMessageConverter());
//        super.configureMessageConverters(converters);
//    }

    private HttpMessageConverter<Object> createXmlHttpMessageConverter() {
        MarshallingHttpMessageConverter xmlConverter = new MarshallingHttpMessageConverter();
        XStreamMarshaller xstreamMarshaller = new XStreamMarshaller();
        xmlConverter.setMarshaller(xstreamMarshaller);
        xmlConverter.setUnmarshaller(xstreamMarshaller);
        return xmlConverter;
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送请求/signOut来到success
        registry.addViewController("/signOut").setViewName("greeting");
    }
}
