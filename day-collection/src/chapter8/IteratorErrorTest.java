package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("java ee");
        books.add("java jy");
        books.add("Android");
        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("Android")){
                books.remove(book);
            }
            System.out.println("============");
            System.out.println(book);
            System.out.println("============2222");
        }
    }
}
