package com.pu.basisjava.demo.设计模式.代理模式动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName : JDKDynamicProxy
 * @Description :
 * @Author : lly
 * @Date: 2020-08-04 10:14
 */
public class JDKDynamicProxy implements InvocationHandler {

    // 被代理的对象
    Person target;

    // JDKDynamicProxy构造函数
    public JDKDynamicProxy(Person person) {
        this.target = person;
    }
    // 获取代理对象
    public Object getTarget() {
        return (Person)
                Proxy.newProxyInstance(target.getClass().getClassLoader(),
                        target.getClass().getInterfaces(), this);
    }
    // 动态代理invoke方法
    public Person invoke(Object proxy, Method method, Object[] args) throws
            Throwable {
        // 被代理方法执行前
        System.out.println("JDKDynamicProxy do something before!");
        // 执行被代理对象方法
        Person result = (Person) method.invoke(target, args);
        // 被代理方法执行后
        System.out.println("JDKDynamicProxy do something after!");
        return result;
    }
}
