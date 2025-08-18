package com.wlg.duoxianchenglearn;

public class Test {
    public static void main(String[] args) {
        //1.main方法作为程序的入口，里面执行的逻辑/任务就是主线程的任务
        for(int i = 1; i <= 10 ; i++){
            System.out.println("main ---" + i);
        }

        //6.创建子线程对象，执行任务
        TestThread t = new TestThread();
        //7.执行任务，不是直接调用run方法，而是将线程启动：
        t.start();//8.一旦子线程启动，就会和主线程争夺资源

        //9.主线程中再加入一个循环：
        for(int i = 1; i <= 10000 ; i++){
            System.out.println("main--main---" + i);
        }
    }
}
