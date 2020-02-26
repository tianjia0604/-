package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private static final int PORT = 9999;

    public static void main(String[] args) throws IOException {
        //启动TCP服务器
        ServerSocket serverSocket = new ServerSocket(PORT);
        while(true) {
            //阻塞，等待新的客户端连接
            Socket socket = serverSocket.accept();
            //多线程处理
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //处理客户端连接的业务，这个业务可能会发生阻塞
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
                        OutputStream os = socket.getOutputStream();
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
                        String line;
                        //阻塞等待客户端传过来的新的一行数据
                        while((line = br.readLine())!= null) {
                            System.out.println("服务端接收到数据 "+ line);
                            bw.write("我已经接收到了" + line + "消息\n");
                            bw.flush();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }

    }
}
