package com.pu.basisjava.demo.设计模式.工厂模式;

/**
 * @ClassName : ComputerFactory
 * @Description :工厂类
 * @Author : lly
 * @Date: 2020-08-04 09:37
 */
public class ComputerFactory {
    public static Computer createComputer(String type){
        Computer mComputer=null;
        switch (type) {
            case "lenovo":
                mComputer=new LenovoComputer();
                break;
            case "hp":
                mComputer=new HpComputer();
                break;
        }
        return mComputer;
    }
}

