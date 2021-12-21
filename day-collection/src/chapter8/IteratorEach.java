package chapter8;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorEach {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("java ee");
        c.add("java jy");
        c.add("Android");
        Iterator it = c.iterator();
        it.forEachRemaining(obj -> System.out.println("迭代集合元素："+obj));

    }
}
