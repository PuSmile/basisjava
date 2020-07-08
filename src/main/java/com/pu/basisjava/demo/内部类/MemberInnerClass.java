package com.pu.basisjava.demo.内部类;

/**
 * @Description:内部类的创建方式分为5种分别为成员内部类，方法内部类，匿名内部类，静态内部类，接口内部类
 * 此例为成员内部类
 */
public class MemberInnerClass {
    private int i = 1;

    class InnerClass {
//        正确写法
         private int a=1;
         private static final int b=2;
//         错误写法
//         private static final Integer c=new Integer(1);//非编译期常量，需要类加载
//         private static int d=4;//不可以有static修饰的变量和方法，违背先加载外部类的原则
         public void get(){
//             内部类获取外部变量两种获取方式
             System.out.println(i);
             System.out.println(MemberInnerClass.this.i);
         }
    }
    
    public static void main(String[] args){
//        访问外部变量或方法
        InnerClass innerClass = new MemberInnerClass().new InnerClass();
        System.out.println(innerClass.a);
        innerClass.get();
//        访问外部常量两种方式
        System.out.println(MemberInnerClass.InnerClass.b);
        System.out.println(innerClass.b);
    }
}
