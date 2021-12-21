package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add(6);
        System.out.println("c集合的元素个数为:"+c.size());
        c.remove(6);
        System.out.println("c集合的元素个数为:"+c.size());
        System.out.println("c集合的元素是否包含孙悟空:"+c.contains("孙悟空"));
        c.add("JAVA EE");
        System.out.println("c集合的元素："+c);

        Collection books = new HashSet();
        books.add("JAVA EE");
        books.add("JAVA JY");
        System.out.println("C集合是否包含books集合"+c.containsAll(books));
        c.removeAll(books);
        System.out.println("c集合的元素："+c);
        c.clear();
        System.out.println("c集合的元素："+c);
        books.retainAll(c);
        System.out.println("books集合的元素："+books);



    }
}
