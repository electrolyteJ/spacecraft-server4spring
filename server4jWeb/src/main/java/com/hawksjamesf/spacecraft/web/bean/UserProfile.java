package com.hawksjamesf.spacecraft.web.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "userprofile")
@PropertySource(value = {"classpath:userprofile.properties"})
@Validated
public class UserProfile {
//    @Value("${profile.userId}")
    private long userId;
//    @Value("#{12*12}")
    private int age;
//    @Value("true")
    private boolean male;
    @Email
    private String email;
    private Map<String,Object> maps;
    private List<Object> lists;

    @Override
    public String toString() {
        return "Profile{" +
                "userId=" + userId +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }
}
