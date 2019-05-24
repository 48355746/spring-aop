package com.ledo.advisor;

import org.aspectj.lang.annotation.Pointcut;

public class TestNamePointcut {
    @Pointcut("within(com.ledo.advisor.*)")
    private  void inPackage(){}
    @Pointcut("execution(* greetTo(..))")
    protected void greetTo(){}
    @Pointcut("inPackage() && greetTo()")
    public void inPkgGreetTo(){}
}
