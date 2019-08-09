package com.kayak.consume_1.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by JayJ on 2019/8/8.
 **/
public class Client extends Thread {

    public static void main(String[] args){
        Client client = new Client("127.0.0.1", 6768);
        client.start();
    }
    //定义一个Socket对象
    Socket socket = null;

    public Client(String host, int port) {
        try {
            //需要服务器的IP地址和端口号，才能获得正确的Socket对象
            socket = new Socket(host, port);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        //客户端一连接就可以写数据个服务器了
        new sendMessThread().start();
        super.run();
        try {
            // 读Sock里面的数据
            InputStream s = socket.getInputStream();
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = s.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {

                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class sendMessThread extends Thread{
        @Override
        public void run() {
            super.run();
            //写操作
            Scanner scanner=null;
            OutputStream os= null;
            try {
                scanner=new Scanner(System.in);
                os= socket.getOutputStream();
                String in="";
                do {
                    //in="{body:{'username':'李天'}}";//scanner.next();
                    in = scanner.next();
                    os.write(("客户端:"+in).getBytes());
                    os.flush();
                } while (!in.equals("bye"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            scanner.close();
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
