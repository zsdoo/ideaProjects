package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("java ee");
        books.add("java jy");
        books.add("Android");
        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("java jy")){
                it.remove();
            }
            book="测试字符串";
        }
        System.out.println(books);
    }
}
