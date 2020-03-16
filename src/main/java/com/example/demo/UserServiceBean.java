package com.example.demo;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuexuxu on 2020-03-16
 */
@Service
public class UserServiceBean implements FactoryBean {
    @Autowired
    private AcService acService;  //包含一个普通Bean，查看给普通Bean的初始化时机
    public UserServiceBean() {
        System.out.println("UserServiceBean 的构造方法..");
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
