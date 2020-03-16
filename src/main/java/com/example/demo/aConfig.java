package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xuexuxu on 2020-03-16
 */
@Configuration
public class aConfig {
    public aConfig() {
        System.out.println("aConfig 构造函数...");
    }
    @Bean
    public PersonServiceBean personService(IAccount account) {
        PersonServiceBean personServiceBean = new PersonServiceBean();
        personServiceBean.setAccount(account);
        return personServiceBean;
    }
    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
