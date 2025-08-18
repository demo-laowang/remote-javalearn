package com.wlg.wangluobianchenglearn;

import java.io.*;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        //套接字：指定服务器的ip和端口号  用法： Socket（ip,端口号）；
        Socket s = new Socket("192.168.0.102",8888);
        //对于程序员来说，利用输出流在传送数据：
        OutputStream os = s.getOutputStream();//通过套接字得到一个数据流
        DataOutputStream dos = new DataOutputStream(os);

        //传送数据
        dos.writeUTF("你好，服务器，我是客户端");

        //对服务器返回的数据进行处理：
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        String s1 = dis.readUTF();
        System.out.println("服务器对我说：" + s1);

        //流、网络资源的关闭：
        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();


    }
}
