package Demo;

import java.io.File;
import java.io.IOException;

//无限创建文件
public class Test1 {
    public static void main(String[] args) throws IOException {
        int num=0;

        while ( true){
            File file1=new File("D:/aa");
            //判断文件或者目录存在吗？
            if (!file1.exists()){
                file1.mkdir();
            }
            File file=new File("D:/aa/"+num+".txt");
            file.createNewFile();
            num++;
        }
    }
}
