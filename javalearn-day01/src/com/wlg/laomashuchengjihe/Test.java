package com.wlg.laomashuchengjihe;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * [老马书城集合版]项目功能：
 * 1.展示书籍
 * 2.上新书籍
 * 3.下架书籍
 * 4.退出应用
 * */
public class Test {
    public static void main(String[] args) {
        //创建一个集合：用于存放相同个体--》书籍对象
        ArrayList list = new ArrayList();//空集合，作用于整个main函数
        //打印菜单：

        while(true){
            System.out.println("---------欢迎来到老马书城-------------");
            System.out.println("1.展示书籍");
            System.out.println("2.上架书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");

            //借助Scanner类来实现键盘输入
            Scanner sc = new Scanner(System.in);
            //利用键盘输入序号：
            System.out.println("请录入你想执行的功能的序号：");
            int choice = sc.nextInt();

            if(choice==1){
                System.out.println("[老马书城]>>>>>>>>>>1.展示书籍");
                for(int i = 0;i < list.size() ;i++){
                    Book b = (Book)list.get(i);
                    System.out.println(b.getBNo() + "---" + b.getBName() + "---" + b.getbAuthor());
                }
            }
            if(choice==2){
                System.out.println("[老马书城]>>>>>>>>>>2.上架书籍");
                System.out.println("请录入书籍编号：");
                int bNo = sc.nextInt();
                System.out.println("请录入书籍名称：");
                String bName = sc.next();
                System.out.println("请录入书籍作者：");
                String bAuthor = sc.next();
                Book b = new Book();
                b.setBNo(bNo);
                b.setBName(bName);
                b.setbAuthor(bAuthor);

                list.add(b);//添加个体到集合中去
            }
            if(choice==3){
                System.out.println("[老马书城]>>>>>>>>>>3.下架书籍");
                //录入你要下架的书籍的编号
                System.out.println("请录入你要下架的书籍的编号：");
                int delNo = sc.nextInt();
                //下架编号对应的书籍：
                for(int i = 0;i < list.size() ;i++){
                    Book b = (Book)list.get(i);

                    if(b.getBNo() == delNo){
                        list.remove(b);
                        System.out.println("书籍下架成功");
                        break;
                    }
                }
            }
            if(choice==4){
                System.out.println("[老马书城]>>>>>>>>>>4.退出应用");
                break;
            }
        }
    }
}
