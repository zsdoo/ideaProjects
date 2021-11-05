package cn.itcast.day07.demo03;

import java.util.Random;

/*
题目要求：
根据int变量n 的值 来取值，范围是[1,n],可以取到1，也可以取到n.

 */
public class Demo03Random {
    public static void main(String[] args) {
        int n=5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n)+1; //
            System.out.println(result);
        }

    }
}
