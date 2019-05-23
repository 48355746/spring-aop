package com.ledo.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdvisorTest {
    public static void main(String[] args) {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop-regexp.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");
       // Seller seller = (Seller) ctx.getBean("seller");
        waiter.greetTo("Jhone");
        waiter.serveTo("Jone");
        //seller.greetTo("John");
    }
}
