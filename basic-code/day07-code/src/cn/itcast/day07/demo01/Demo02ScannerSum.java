package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
题目：键盘输入两个数字，并且求和。
思路：
1 Scnanner
2 导包，创建，使用
3 需要两上数字，要调两次nextInt方法
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a =sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        int result = a+b;
        System.out.println("结果是："+result);
    }
}
