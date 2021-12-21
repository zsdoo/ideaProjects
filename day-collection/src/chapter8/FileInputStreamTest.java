package chapter8;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

        public static void main(String[] args) throws IOException {
            FileInputStream fis =new FileInputStream("D:\\Users\\86132\\IdeaProjects\\day-collection\\src\\chapter8\\FileInputStreamTest.java");
            byte[] bbuf= new byte[1024];
            int hasRead=0;
            while ((hasRead = fis.read(bbuf)) > 0 ){
                System.out.print(new String(bbuf , 0, hasRead));
            }
            fis.close();
        }
}
