package com.wlg.day02;

public class PersonTest2 {
    public static void main(String[] args) {
        /*
        * 创建一个Person类的对象
        * new Person（）；
        * Person 空构造方法
        * 构造器的作用：底层帮我们创建对象，在创建对象之后进行初始化操作
        *
        * 如果一个类没有显示的构造器的话，那么系统会为这个类默认分配一个空构造器
        * 调用构造器以后，对对象进行初始化操作，将对象的地址返回给p
        * */
        Person p = new Person();
        Person p2 = new Person("高达",18,160.6);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.height);

    }
}
