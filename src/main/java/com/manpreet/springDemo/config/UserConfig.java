package com.manpreet.springDemo.config;

import com.manpreet.springDemo.domain.User;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

public class UserConfig {
    @Bean
    public User user(){
        return new User("Manpreet","Khangura","Java", Collections.emptyList(),Collections.emptyMap());
    }
}
