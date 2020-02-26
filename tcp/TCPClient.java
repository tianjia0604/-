package tcp;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    private  static final String HOST = "localhost";
    private static final int PORT = 9999;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(HOST,PORT);
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        OutputStream os = socket.getOutputStream();
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
        //bw.write("hello,我来了");
        //bw.flush();
        PrintWriter pw = new PrintWriter(os,true);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            pw.println(line);
            String response = br.readLine();
            System.out.println("接收到服务端响应" + response);
        }
    }
}
