package com.example.demo;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by xuexuxu on 2020-03-16
 */
public class SomeServiceBean implements FactoryBean {
    public SomeServiceBean() {
        System.out.println("SomeServiceBean 的构造方法");
    }
    @Override
    public Object getObject() throws Exception {
        return "";
    }
    @Override
    public Class<?> getObjectType() {
        return Object.class;
    }
}
