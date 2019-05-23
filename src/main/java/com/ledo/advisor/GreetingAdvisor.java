package com.ledo.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * 切面
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {
    //重写切点
    public boolean matches(Method method, Class<?> aClass) {
        return "greetTo".equals(method.getName());
    }

    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            public boolean matches(Class<?> aClass) {
                return Waiter.class.isAssignableFrom(aClass);
            }
        };
    }
}
