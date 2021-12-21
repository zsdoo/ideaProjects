package chapter8;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionStream {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("疯狂java ee"));
        books.add(new String("疯狂java jy"));
        books.add(new String("疯狂AndroidAndroidAndroidAndroid"));
        books.add(new String("疯狂iosiosiosiosiosiosiosios"));
        System.out.println(books.stream().filter(ele->((String)ele).contains("疯狂")).count());
        System.out.println(books.stream().filter(ele->((String)ele).contains("java")).count());
        System.out.println(books.stream().filter(ele->((String)ele).length()>10).count());
        books.stream().mapToInt(ele -> ((String)ele).length()).forEach(System.out::println);
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
//        System.out.println(squaresList);



    }
}
