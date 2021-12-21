package chapter8;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("java ee");
        books.add("java jy");
        books.add("Android");
        books.forEach(obj -> System.out.println("迭代集合元素："+obj));
    }
}
