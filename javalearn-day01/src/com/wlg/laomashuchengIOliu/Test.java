package com.wlg.laomashuchengIOliu;

import java.io.*;
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
    public static void main(String[] args) throws IOException, ClassNotFoundException {

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
                //从文件中读取list集合
                //文件
                File f = new File("A:\\demo2.txt");
                //流
                if(f.exists() == true){
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    //操作（读取）
                    ArrayList list = (ArrayList) (ois.readObject());

                    //关闭流
                    ois.close();
                    fis.close();

                    for(int i = 0;i < list.size() ;i++){
                        Book b = (Book)list.get(i);
                        System.out.println(b.getBNo() + "---" + b.getBName() + "---" + b.getbAuthor());
                    }
                }else{//文件不存在
                    System.out.println("当前没有上新书籍，请先上新书籍在进行书籍展示。");
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

                //将集合对象写出硬盘盘符文件中去：
                //文件：
                File f = new File("A:\\demo2.txt");
                if(f.exists() == true){//文件存在 证明之前文件的集合中已经有书籍了
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    //操作（将集合读取出来再追加新的书籍代码）
                    ArrayList list = (ArrayList) (ois.readObject());

                    //操作（将集合读取出来再追加新的书籍代码）
                    list.add(b);
                    //将这个集合写出去
                    //需要流：(管套管，也是两个流进行处理)
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    //将list写出
                    oos.writeObject(list);
                    //关闭流
                    ois.close();
                    oos.close();
                }else{//文件不存在，证明是第一次上新书籍
                    //创建一个集合：用于存放相同个体--》书籍对象
                    ArrayList list = new ArrayList();//空集合
                    list.add(b);//添加个体到集合中去

                    //将集合对象写出硬盘盘符文件中去：
                    //需要流：(管套管，也是两个流进行处理)
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    //将list写出
                    oos.writeObject(list);

                    //关闭流
                    oos.close();
                    fos.close();
                }

            }
            if(choice==3){
                System.out.println("[老马书城]>>>>>>>>>>3.下架书籍");


                //下架编号对应的书籍：
                File f = new File("A:\\demo2.txt");
                if(f.exists()){//文件存在 证明之前文件的集合中已经有书籍了
                    //录入你要下架的书籍的编号
                    System.out.println("请录入你要下架的书籍的编号：");
                    int delNo = sc.nextInt();
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    //操作（将集合读取出来）
                    ArrayList list = (ArrayList) (ois.readObject());

                    //操作（对集合进行遍历，然后删除对应序号的书籍）
                    for(int i = 0;i < list.size();i++){
                        if(i == delNo - 1){
                            list.remove(i);
                            System.out.println("书籍下架成功");
                            break;
                        }
                    }
                    //再次将这个集合写入文件（文件已经被修改）
                    //需要流：(管套管，也是两个流进行处理)
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    //将list写出
                    oos.writeObject(list);
                    //关闭流
                    ois.close();
                    oos.close();
                }else{//文件不存在，证明没有书籍可以下架
                    System.out.println("没有书籍可以下架");
                }
//                for(int i = 0;i < list.size() ;i++){
//                    Book b = (Book)list.get(i);
//
//                    if(b.getBNo() == delNo){
//                        list.remove(b);
//                        System.out.println("书籍下架成功");
//                        break;
//                    }
//                }
            }
            if(choice==4){
                System.out.println("[老马书城]>>>>>>>>>>4.退出应用");
                break;
            }
        }
    }
}
