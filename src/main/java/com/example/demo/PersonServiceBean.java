package com.example.demo;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by xuexuxu on 2020-03-16
 */
//FactoryBean类
public class PersonServiceBean implements FactoryBean {
    private IAccount account;
    public IAccount getAccount() {
        return account;
    }
    public PersonServiceBean() {
        System.out.println("PersonServiceBean 构造方法...");
    }
    public void setAccount(IAccount account) {
        this.account = account;
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
