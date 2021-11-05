package cn.itcast.day05.demo01;
/*
动态初始化默认值：int 0  double 0.0  boolean false
                 String /u0000  引用类型 null

java的内存需要划分为5个部分
1 栈（Stack）：存放的都是方法中的局部变量。方法的运行一定要在栈当中
    局部变量：方法的参数，或者是方法{}内部的变量
    作用域：一旦超出作用域，立刻从栈内存当中消失。
2 堆（Heap）：凡是new 出来的东西，都在堆当中
    堆内存里面的东西都有一个地址值：16进制
    堆内存里面的数据都有默认值。
3 方法区（Method Area)：存储.class相关信息，包含方法的信息
4 本地方法栈（Native Method Stack):与操作系统相关
5 寄存器（pc Register):与CPU相关。
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("=====================");

        array[1]=123;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
