package com.pu.basisjava.demo.设计模式.工厂模式;

/**
 * @ClassName : CreatComputer
 * @Description :
 * @Author : lly
 * @Date: 2020-08-04 09:43
 */
public class CreatComputer {

    public static void main(String[]args){
        ComputerFactory.createComputer("hp").start();
    }

}
