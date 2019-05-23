package com.ledo.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdvisorTest {
    public static void main(String[] args) {
        //普通切面 方法类名
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        //正则切面
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop-regexp.xml");
        //动态切面
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-dynamicpointcut.xml");
        //流程切面，流程方法中的所有方法都会增强
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-flowadvisor.xml");
        // 复合切面
//        WaiterDelegate wd=new WaiterDelegate();
//        wd.setWaiter(waiter);
//        wd.service("Peter");
//复合切面
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-composable.xml");
        //根据bean名称自动创建代理
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-autoproxy.xml");
        //根据advisor 自动创建代理
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-autoproxy-advisor.xml");

        //Waiter waiter = (Waiter) ctx.getBean("waiter");
        Waiter waiter = (Waiter) ctx.getBean("waiterTarget");

       // Seller seller = (Seller) ctx.getBean("seller");

//        WaiterDelegate wd=new WaiterDelegate();
//        wd.setWaiter(waiter);
//        wd.service("Peter");

        waiter.greetTo("Tom1");
        waiter.serveTo("Jone");
        //seller.greetTo("John");
    }
}
