package chapter8;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachTest {
    public static void main(String[] args) {
        Collection books = new ArrayList();
        books.add("java ee");
        books.add("java jy");
        books.add("Android");
        System.out.println(books);
        System.out.println("=================");
        for (Object obj :books){
            String book = (String)obj;
            System.out.println(book);
            System.out.println("-----------");
            if (book.equals("java jy")){
                books.remove(book);
                System.out.println(book);
                System.out.println("-----------111");
            }
        }
        System.out.println("=================");
        System.out.println(books);
    }
}
