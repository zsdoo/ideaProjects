package cn.itcast.day04.demo02;

/*
要求：定义一个方法，求出两个数字之和（结果告诉我）
    2 定义一个方法，打印两个数字之和（结果自己打印）
注意：对于无返回值 的方法，只能使用单独调用。
 */

public class Demo04MethodReturn {
    public static void main(String[] args) {
        //我是main方法，我来调用。你把结果告诉我
        int num=getSum(10,20);
        System.out.println("返回值是："+num);
        System.out.println("======================");

        printSum(100,200);
    }
    //两个数字相加，有返回值 "int",结果
    public static int getSum(int a, int b){
        int result =a+b;
        return result;
    }
    //没有返回值，结果自己打印 “void”
    public static void printSum(int a, int b){
        int result= a+b;
        System.out.println("结果是："+ result);
    }

}
