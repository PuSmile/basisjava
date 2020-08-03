package com.pu.basisjava.demo.设计模式.构建者模式;

/**
 * @Description:
 * @Author: lly
 * @Date: 2020/8/3 22:17
 */
public class BuildTest {
    public static void main(String[] args){
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.installKeybord("键盘");
        computerBuilder.installDisplayer("显示器");
        computerBuilder.installMainUnit("主机");
        computerBuilder.installMouse("鼠标");

        Computer build = computerBuilder.build();
        System.out.println(build);
    }
}
