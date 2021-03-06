package com.ledo.advisor;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class GreetingComposablePointcut {
    //复合切点取交集，只有waiterdelegate中sevice调用greetTo方法时才会增强
    public Pointcut getIntersectionPointcut(){
        //创建复合切点
        ComposablePointcut cp = new ComposablePointcut();
        //创建一个流程切点
        Pointcut pt1 = new ControlFlowPointcut(WaiterDelegate.class, "service");
        //创建一个方法名切点
        NameMatchMethodPointcut pt2 = new NameMatchMethodPointcut();
        pt2.addMethodName("greetTo");
        return cp.intersection(pt1).intersection((Pointcut) pt2);
    }
}
