package cn.itcast.day06.demo01;

import org.w3c.dom.ls.LSOutput;
/*
面向过程：每个步骤都要处理
面向对象：找个功能，直接得到结果
 */

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array= {10,20,30,40,50};

        //要求打印格式为[10,20,30,40,50]   面向过程：
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                System.out.println(array[i]+"]");
            } else{
                System.out.print(array[i] +", ");
            }
        }
        System.out.println("===================");

        //面向对象：
        System.out.println(Arrays.toString(array));
    }

}
