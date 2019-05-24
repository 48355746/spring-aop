package com.ledo.advisor;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreGreetingAspect {
    @Before("execution(* serveTo(..))")
    public void beforeGreeting() {
        System.out.println("How are you");
    }
    @After("execution(* serveTo(..))")
    public void afterGreeting() {
        System.out.println("Bye");
    }
    @Before("@annotation(com.ledo.advisor.AspectTest)")
    public void beforeAnnotationGreeting() {
        System.out.println("How are you Annotation");
    }

}
