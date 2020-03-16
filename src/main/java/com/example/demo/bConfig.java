package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xuexuxu on 2020-03-16
 */
@Configuration
public class bConfig {
    public bConfig() {
        System.out.println("bConfig 构造函数...");
    }

    @Bean
    public SomeServiceBean someServiceBean() {
        return new SomeServiceBean();
    }
}
