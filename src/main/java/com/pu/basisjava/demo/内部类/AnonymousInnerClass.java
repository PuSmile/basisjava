package com.pu.basisjava.demo.内部类;

/**
 * @Description:内部类的创建方式分为5种分别为成员内部类，方法内部类，匿名内部类，静态内部类，接口内部类 此方法为匿名内部类
 */
public class AnonymousInnerClass {

    private int a= 0;

    //   接口
    interface HelloWord {
        void get();
        void get(String str);
    }

    public void sayHello() {


//        匿名内部类实现接口    无类名
        HelloWord helloWord = new HelloWord() {


            @Override
            public void get() {
                get("Hello");
            }

            @Override
            public void get(String str) {
                System.out.println(str);
            }

        };

        helloWord.get();
    }



    public void getOuter() {
        System.out.println("匿名内部类可以访问其外部方法");
    }

    //    父类
    class Parent {
        private String name;

        public Parent(String name) {
            this.name = name;
        }

        public void print() {
            System.out.println(parent.name);
        }
    }

    //    匿名子类可以覆写父类方法
    Parent parent = new Parent("娃娃") {
        @Override
        public void print() {
            getOuter(); //访问外部方法
            super.print();
        }
    };

    interface ParamDiff{
        void getA(int a);
    }

    ParamDiff paramDiff=new ParamDiff() {
        public int a=1;

        @Override
        public void getA(int a) {
            System.out.println(a);//参数
            System.out.println(this.a);//内部类的成员变量
            System.out.println(AnonymousInnerClass.this.a);//AnonymousInnerClass类的成员变量
        }
    };

    public static void main(String[] args){
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
        anonymousInnerClass.sayHello();
        anonymousInnerClass.parent.print();
        anonymousInnerClass.paramDiff.getA(23);
    }
}
