package Chapter_9;

import java.io.*;

public class file {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\text1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("D:\\text2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }
        System.out.println("代码被修改啦");
        System.out.println("代码又被修改啦");
        System.out.println("代码在hot-fix分支修改啦");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        System.out.println("pull test");
        
        bis.close();
        bos.close();
        fis.close();
        fos.close();
    }
}
