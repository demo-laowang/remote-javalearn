package com.wlg.IOlearn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
功能：读取文件内容
* */
public class Test {
    public static void main(String[] args) throws IOException {
        //对文件进行操作，必须对文件封装为具体的File类的对象：
            File f = new File("A:\\test.txt");
            //“管子” = “流” 输入字符流
            FileReader fr = new FileReader(f);//将这个管子怼到文件上
            //开始动作 - 读取文件内容
            int n = fr.read();
            while(n!=-1){
                System.out.println(n);
                n = fr.read();
            }
//            int n1 = fr.read();
//            System.out.println(n1);

            //流关闭操作
            fr.close();

    }
}
