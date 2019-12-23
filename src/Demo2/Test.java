package Demo2;

import java.io.File;


//读e盘下的后缀为.class文件
public class Test {
    public static void main(String[] args) {
        File file =new File("E://");
        getFileName(file);
    }

    private static void getFileName(File file) {
        //传过来的可能是空
        if (file==null){
            return;
        }
        //判断是否是文件
        if (file.isFile()) {
            if (file.getName().endsWith(".class")) {
                System.out.println(file.getName());
            }
        }
        //文件夹 获取文件夹下的所有文件对象
        File[] files=file.listFiles();
        if (files==null){
            return;
        }
        for (File f : files) {
            if (f.isFile()) {
                //判断是否以.class结尾
                if (f.getName().endsWith(".class")){
                    System.out.println(f.getName());
                }
            }else {
                getFileName( f);
            }
        }

    }
}
