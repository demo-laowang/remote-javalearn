package com.wlg.IOlearn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
功能：将程序中的内容输出到文件中去
* */
public class shuchuliuTest {
    public static void main(String[] args) throws IOException {
        //程序中的字符串：
        String str = "abc你好";
        //文件
        File f = new File("A:\\demo.txt");
        //字符输出流
        FileWriter fw = new FileWriter(f);

        //动作：输出
        fw.write(str);

        //流关闭
        fw.close();


    }
}
