package homework1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//读取文本文件
public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file =new File("a.txt");
        FileInputStream fis=new FileInputStream(file);
        int dex;
        while ((dex=fis.read())!=-1)
            System.out.print((char)dex);
    }
}
