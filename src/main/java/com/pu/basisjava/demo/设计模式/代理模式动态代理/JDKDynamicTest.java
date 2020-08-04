package com.pu.basisjava.demo.设计模式.代理模式动态代理;

/**
 * @ClassName : JDKDynamicTest
 * @Description :jdk动态代理测试
 * @Author : lly
 * @Date: 2020-08-04 10:33
 */
public class JDKDynamicTest {
    public static void main(String[] args) {
        System.out.println("不使用动态代理，调用dosomething方法");
        // 不使用代理类
        Person person = new Bob();
        person.doSomething();
        System.out.println("--------------------------------------分割线--------------------------------------");
        System.out.println("使用代理类,调用doSomething方法");
        //获取代理类
        Person target=(Person)new JDKDynamicProxy(new Bob()).getTarget();
        // 调用doSomething方法
        target.doSomething();
    }
}
