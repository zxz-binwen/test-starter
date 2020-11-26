package com.spring.boot.starter.config;

import com.spring.boot.starter.service.UserService;
import com.spring.boot.starter.util.DateUtil;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DateProperties.class)
public class Config {

    @Bean
    public DateUtil dateUtil() {

        return new DateUtil();
    }

//    @Bean
//    public UserService userService() {
//        return new UserService();
//    }

}
