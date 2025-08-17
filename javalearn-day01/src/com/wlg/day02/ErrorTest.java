package com.wlg.day02;

import java.sql.SQLOutput;

public class ErrorTest {
    public static void main(String[] args) {
        try {
            int num1 = 12;
            int num2 = 3;
            System.out.println("两个数的商为" + num1 / num2);//该代码出现错误，该代码后面的代码不会进行执行
        }catch (Exception e){
            System.out.println("对不起，你的程序出现了错误");//程序出现异常，但不会影响后续程序的执行。
        }finally{
            System.out.println("程序无论是否出现异常，这个逻辑都必须进行执行");
        }

        System.out.println("上面是两个数相除的案例1");
    }
}
