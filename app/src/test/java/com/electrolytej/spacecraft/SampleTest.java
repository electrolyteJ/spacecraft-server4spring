package com.electrolytej.spacecraft;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class SampleTest {

//    @Autowired
//    UserProfile profile;

//    @Autowired
//    ApplicationContext ioc;

    @Autowired
    DataSource dataSource;

    @Test
    public void test() {
        System.out.println("dataSource:" + dataSource.getClass());
//        System.out.println("UserProfile:" + profile);
//        System.out.println("MyService:" + ioc.containsBean("custService"));
//        System.out.println("MyService:" + ioc.containsBean("custService"));
//        System.out.println("HttpMessageConverters:" + ioc.containsBean("custConverters"));
    }
}
