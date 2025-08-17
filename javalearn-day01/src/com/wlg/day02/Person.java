package com.wlg.day02;
//人 类
public class Person {
    //特性-属性-名词(只定义和业务逻辑相关的代码)
    String name;//姓名
    int age;//年龄
    double height;//身高


    //行为-方法-动词(只定义和业务逻辑相关的代码)
    public void study(){
        System.out.println("我正在学习");
    }

    //显示的空构造器
    public Person(){
        System.out.println("调用空构造器");
    }
    //
    public Person(String name,int age,double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

}
