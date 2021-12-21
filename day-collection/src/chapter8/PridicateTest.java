package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PridicateTest {

    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("疯狂java ee讲义讲义讲义讲义"));
        books.add(new String("疯狂java jy讲义讲义"));
        books.add(new String("Android发"));
        books.add(new String("IOS讲义"));
        books.add(new String("AJAX讲义"));
//        books.removeIf(ele -> ((String) ele).length() < 10);
//        System.out.println(books);
//        for (Object obj : books) {
//            System.out.println(obj);
//        }
        //包含疯狂的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).contains("疯狂")));
        //包含讲义的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).contains("讲义")));
        //长度小于10的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).length()<10));

    }

    public static int calAll(Collection books, Predicate p) {
        int total = 0;
        for (Object obj : books) {
            if (p.test(obj)) {
                total++;
            }

        }
        return total;
    }
}
