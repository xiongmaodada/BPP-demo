package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;

/**
 * Created by xuexuxu on 2020-03-16
 */
//后置处理器
public class MyBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
    public MyBeanPostProcessor() {
        System.out.println("MyBeanPostProcessor 初始化...");
    }
    //低优先级
    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
