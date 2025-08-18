package com.wlg.duoxianchenglearn;
/*
* 2.创建一个线程类：TestThread
* 3.想要具备多线程的能力 -> extends Thread
* */
public class TestThread extends Thread{
    // 4.线程对应的任务放在一个方法：
    @Override
    public void run() {
        for(int i=1;i<100;i++){
            System.out.println("子线程---" + i);
        }
    }
}
