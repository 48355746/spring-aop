package com.ledo.advisor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreGreetingAspect {
    @Before(value = "execution(* serveTo(..))&&args(name)")
    public void beforeGreeting(String name) {
        System.out.println("How are you-------"+name);
    }
    @After("execution(* serveTo(..))")
    public void afterGreeting() {
        System.out.println("Bye");
    }
    @Before("@annotation(com.ledo.advisor.AspectTest)")
    public void beforeAnnotationGreeting() {
        System.out.println("How are you Annotation");
    }
    @AfterReturning(value = "target(com.ledo.advisor.Waiter)",returning = "retVal")
    public  void bingReturnValue(String retVal)
    {
        System.out.println(retVal);
    }
}
