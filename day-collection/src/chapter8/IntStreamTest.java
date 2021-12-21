package chapter8;

import java.util.stream.IntStream;

public class IntStreamTest {
    public static void main(String[] args) {
        IntStream.Builder is = IntStream.builder();
        is.add(20);
        is.add(13);
        is.add(-2);
        is.add(18);
        //下面一次只能执行一行
//        System.out.println("is 最大值是："+ is.build().max().getAsInt());
//       System.out.println("is 最小值是："+ is.build().min().getAsInt());
//        System.out.println("is 总合是："+ is.build().sum());
//        System.out.println("is 总数是："+ is.build().count());
//        System.out.println("is 平均值是："+ is.build().average().getAsDouble());
//        System.out.println("is 平方是否大于20："+ is.build().allMatch(ele -> ele*ele>20));
        System.out.println("is 是否包含平方大于20："+ is.build().anyMatch(ele -> ele*ele>20));

//
//        IntStream newIs = is.build().map(ele -> ele *2 + 1);
//        newIs.forEach(System.out::println);

    }
}
