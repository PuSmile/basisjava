package com.pu.basisjava.demo.设计模式.构建者模式;

/**
 * @Description:构建类
 * @Author: lly
 * @Date: 2020/8/3 22:10
 */
public  class ComputerBuilder {

     private Computer computer=new Computer();

    public void installDisplayer(String displayer){
        computer.setDisplayer(displayer);
    }
    public void installMainUnit(String mainUnit){
        computer.setMainUnit(mainUnit);
    }
    public void installMouse(String mouse){
        computer.setMouse(mouse);
    }
    public void installKeybord(String keyboard){
        computer.setKeyboard(keyboard);
    }
    public Computer build(){
        return computer;
    }
}
