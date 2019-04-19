package com.hawksjamesf.spacecraft.web;

import com.hawksjamesf.spacecraft.web.bean.UserProfile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    UserProfile profile;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void test() {
        System.out.println("UserProfile:" + profile);
        System.out.println("MyService:" + ioc.containsBean("custService"));
        System.out.println("MyService:" + ioc.containsBean("custService"));
        System.out.println("HttpMessageConverters:" + ioc.containsBean("custConverters"));
    }
}
