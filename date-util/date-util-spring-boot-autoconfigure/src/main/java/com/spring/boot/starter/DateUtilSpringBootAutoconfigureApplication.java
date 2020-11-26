package com.spring.boot.starter;

import com.spring.boot.starter.entity.User;
import com.spring.boot.starter.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@MapperScan("com.spring.boot.starter.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
@RestController
@SpringBootApplication
public class DateUtilSpringBootAutoconfigureApplication {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(DateUtilSpringBootAutoconfigureApplication.class, args);
    }


    @GetMapping("add")
    public User add(@RequestParam("name") String name, @RequestParam("age") Integer age) {

        return userService.add(name, age);

    }

}
