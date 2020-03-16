package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * Created by xuexuxu on 2020-03-16
 */
@Service
public class AccountImpl implements IAccount{
    public AccountImpl() {
        System.out.println("AccountImpl 的构造方法");
    }
}
