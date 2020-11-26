package com.spring.boot.starter.test;

import com.spring.boot.starter.entity.User;
import com.spring.boot.starter.service.UserService;
import com.spring.boot.starter.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "com.spring.boot.starter")
public class TestApplication {

    @Autowired
    private DateUtil dateUtil;

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }


    @GetMapping("test")
    public String test() {
        return dateUtil.getLocalDate();
    }


    @GetMapping("add1")
    public User add(@RequestParam("name") String name, @RequestParam("age") Integer age) {

        return userService.add(name, age);

    }
}
