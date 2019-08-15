package nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {
    public static void demo1(String begin,String end){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel fisChannel = null;
        FileChannel fosChannel = null;
        try {
             fis = new FileInputStream(new File(begin));
             fos = new FileOutputStream(end);
             //获取传输通道
             fisChannel = fis.getChannel();
             fosChannel = fos.getChannel();
             //获取缓存容器
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            while (fisChannel.read(byteBuffer) != -1){
                //将 Buffer 从写模式切换到读模式
                byteBuffer.flip();
                fosChannel.write(byteBuffer);
                //清空缓冲区
                byteBuffer.clear();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fosChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fisChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        demo1("D:\\begin.txt","D:\\end.txt");
    }
}
