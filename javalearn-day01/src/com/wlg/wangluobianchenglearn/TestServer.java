package com.wlg.wangluobianchenglearn;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器端启动");
        //套接字：
        ServerSocket ss = new ServerSocket(8888);
        //等待客户端发送数据：
        Socket s = ss.accept();//接受客户端传输来的套接字
        //服务器感受到的输入流；
        InputStream is = s.getInputStream();//通过套接字得到一个输入流
        DataInputStream dis = new DataInputStream(is);

        //接收客户端发送的数据
        String str = dis.readUTF();
        System.out.println("客户端说：" + str);

        //向客户端发送数据
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF("你好，客户端，我接受到了你的信息了");

        //关闭流和套接字
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
