package homework1;

import java.io.*;

//读取视频
public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file=new File("Day23_IO流一01.mp4");
        FileInputStream fis=new FileInputStream(file);
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);

        String s;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }
        fis.close();
        isr.close();
        br.close();


    }
}
