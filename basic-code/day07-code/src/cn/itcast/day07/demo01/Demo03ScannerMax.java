package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
题目：键盘输入3个数字，求出最大值
无法同时判断 三个谁最大，首先判断前两个最大值，再和下一个比较
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a =sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b =sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c =sc.nextInt();

        //前两个最大值
        int temp = a > b ? a:b;
        int max = temp > c ? temp : c;
        System.out.println("最大值是："+max);
    }
}
