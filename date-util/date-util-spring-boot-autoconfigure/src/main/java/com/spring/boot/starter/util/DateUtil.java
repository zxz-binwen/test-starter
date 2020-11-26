package com.spring.boot.starter.util;


import com.spring.boot.starter.config.DateProperties;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class DateUtil {

    @Autowired
    private DateProperties dateProperties;

    public String getLocalDate() {

        return dateProperties.getName() + ": " + LocalDate.now().toString();
    }
}
