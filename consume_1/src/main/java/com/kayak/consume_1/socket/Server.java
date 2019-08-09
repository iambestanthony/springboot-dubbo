package com.kayak.consume_1.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by JayJ on 2019/8/8.
 **/
public class Server extends Thread{

    public static void main(String[] args){
        Server server=new Server(6768);
        server.start();
    }

    ServerSocket server = null;

    public Server(int port){
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("服务器正在启动...等待用户的连接!");
            while (true){
                Socket accept = server.accept();
                OutputStream out = accept.getOutputStream();
                out.write("服务器正在向你发送消息...".getBytes());
                System.out.println(server.getInetAddress()+" "+server.getLocalSocketAddress()+"用户已连接！");
                out.flush();
                InputStream in = accept.getInputStream();
                //读取数据
                int len=0;
                byte[] buf=new byte[1024];
                while ((len=in.read(buf))!=-1) {
                    //直接把获得的数据打印出来
                    System.out.println(len);
                    String clientData = new String(buf, 0, len);
                    System.out.println("服务器接收到客户端的数据："+clientData);
                    if ("你好".equals(clientData.replace("客户端:",""))){
                        out.write("Hello！".getBytes());
                    }else if("你是谁".equals(clientData.replace("客户端:",""))){
                        out.write("我是roboot 1号，你又是谁？".getBytes());
                    }else{
                        out.write("<html>hello world</html>".getBytes());
                    }
                    out.flush();
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
