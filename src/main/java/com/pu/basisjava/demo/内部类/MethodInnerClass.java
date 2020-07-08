package com.pu.basisjava.demo.内部类;

/**
 * @Description:内部类的创建方式分为5种分别为成员内部类，方法内部类，匿名内部类，静态内部类，接口内部类
 * 此类为方法内部类
 */
public class MethodInnerClass {
    int c=3;
    private void method(){
         final int a=1;//被内部类访问的局部变量，为了数据一致性要final修饰
         class InnerClass{
             int b=2;
             public void print(){
                 c++;
                 System.out.println("访问外部类方法变量"+a);
                 System.out.println("访问内部类方法变量"+b);
                 System.out.println("访问外部类变量"+c);
             }
         }
         System.out.println("c的值:"+c);
         InnerClass innerClass = new InnerClass();
         innerClass.print();
         System.out.println("c的值:"+c);
    }
    
    public static void main(String[] args){
        MethodInnerClass methodInnerClass = new MethodInnerClass();
        methodInnerClass.method();
    }
}
