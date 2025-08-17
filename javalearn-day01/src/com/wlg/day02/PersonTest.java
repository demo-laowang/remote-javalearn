package com.wlg.day02;

//测试类
public class PersonTest {
    public static void main(String[] args) {
        //对Preson类的对象进行创建，创建了一个Person对象，名字叫p1
        Person p1 = new Person();
        //对属性赋值
        p1.name = "高达";
        p1.age = 20;
        p1.height = 160.6;
        //对属性进行读取
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.height);
        //调用对象的方法：
        p1.study();

    }
}
