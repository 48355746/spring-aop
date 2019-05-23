package com.ledo.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 动态切点
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClientList = new ArrayList<String>();

    static {
        specialClientList.add("John");
        specialClientList.add("Tom");
    }

    //对类进行静态切点检查
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            public boolean matches(Class<?> aClass) {
                System.out.println("调用getclassFilter()对" + aClass.getName() + "做静态检查.");
                return Waiter.class.isAssignableFrom(aClass);
            }
        };
    }
    public boolean matches(Method method, Class<?> aClass) {
        System.out.println("metches(method,aClass)对" + aClass.getName() + "." + method.getName() + "做静态检查.");
        return "greetTo".equals(method.getName());
    }
    //对方法进行静态切点检查
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        System.out.println("metches(method,aClass)对" + aClass.getName() + "." + method.getName() + "做动态检查.");
        String clientName=(String) objects[0];
        return specialClientList.contains(clientName);
    }
}
