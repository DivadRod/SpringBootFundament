package com.fundamentosboot.fundamentosboot.configuration;

import com.fundamentosboot.fundamentosboot.bean.MyBeanWithProperties;
import com.fundamentosboot.fundamentosboot.bean.MyBeanWithPropertiesImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.lastname}")
    private String lastname;

    @Value("${value.random}")
    private String random;


    @Bean
    public MyBeanWithProperties funtion(){
        return new MyBeanWithPropertiesImplement(name, lastname);
    }
}
