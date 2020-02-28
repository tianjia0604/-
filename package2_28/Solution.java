package package2_28;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.io.*;
public class Solution {

//FileInputStream 和 FileOutputStream 进行文件拷贝
//    public static void main(String[] args) throws IOException {
//        FileInputStream fin = new FileInputStream("D:\\bit\\hello.txt");
//        FileOutputStream fout = new FileOutputStream("D:\\bit\\helloCopy.txt");
//        int len = 0;
//        byte[] buff = new byte[1024];
//        while ((len = fin.read(buff)) != -1) {
//            fout.write(buff, 0, len);
//        }
//        fin.close();
//        fout.close();
//    }

//BufferedReader 和 BufferedWriter 进行文件拷贝
//    public static void main(String[] args) throws IOException {
//        FileReader reader=new FileReader("D:\\Ideaproject\\bit.txt");
//        BufferedReader bReader=new BufferedReader(reader);
//        FileWriter writer=new FileWriter("D:\\Ideaproject\\bit2.txt");
//        BufferedWriter bWriter=new BufferedWriter(writer);
//        String content="";
//        //readLine一行一行的读取
//        while((content=bReader.readLine())!=null){
//            //\r\n换行
//            bWriter.write(content+"\r\n");
//        }
//        /**
//         * 关闭流的顺序：
//         * 当A依赖B的时候先关闭A，再关闭B
//         * 带缓冲的流最后关闭的时候会执行一次flush
//         */
//        reader.close();
//        bReader.close();
//        bWriter.close();
//        writer.close();
//    }



//    public static void main(String[] args) {
//        // 创建字节流对象 System.in 代表从控制台输入
//        InputStream in = System.in;
//        // 创建字符流对象
//        BufferedWriter bw = null;
//        BufferedReader br = null;
//        try {
//            // 实例化字符流对象 通过 InputStreamReader 将字节输入流转化成字符输入流
//            br = new BufferedReader(new InputStreamReader(in));
//            //br = new BufferedReader(new InputStreamReader(in,"GBK"));
//            bw = new BufferedWriter(new FileWriter("a.txt"));
//            // 定义读取数据的行
//            String line = null;
//            // 读取数据
//            while ((line = br.readLine()) != null) {
//                // 如果输入的是"exit"就退出
//                if ("exit".equals(line)) {
//                    break;
//                }
//                // 将数据写入文件
//                bw.write(line);
//                // 写入新的一行
//                bw.newLine();
//                // 刷新数据缓冲
//                bw.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            // 释放资源
//            try {
//                if (bw != null)
//                    bw.close();
//                if (br != null)
//                    br.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    public static void main(String[] args) {
        // 定义字节输出流的对象System.out
        OutputStream out = System.out;
        // 定义字符流的对象
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //通过OutputStreamWriter将字符转流换为字节流对象
            bw = new BufferedWriter(new OutputStreamWriter(out));
            //bw = new BufferedWriter(new OutputStreamWriter(out,"GBK"));
            br = new BufferedReader(new FileReader("a.txt"));
            // 定义读取行的字符串
            String line = null;
            // 读取数据
            while ((line = br.readLine()) != null) {
                // 输出到控制台
                bw.write(line);
                // 新的一行
                bw.newLine();
                // 刷新缓冲
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (br != null)
                    br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


