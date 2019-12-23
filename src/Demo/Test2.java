package Demo;

import java.io.File;

//删除e:/aa下的所有文件
public class Test2 {
    public static void main(String[] args) {
        File file =new File("e:/aa");
        //判断是否为空文件
        File[] files =file.listFiles();
         if (files!=null){
             for (File f : files) {
                 f.delete();
             }
         }
}
}
