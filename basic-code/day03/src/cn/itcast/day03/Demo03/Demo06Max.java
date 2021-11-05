package cn.itcast.day03.Demo03;

import org.w3c.dom.ls.LSOutput;

public class Demo06Max {
    public static void main(String[] args) {
        int a =110;
        int b=20;
        //首先使用三元运算符
//        int  max= a>b ? a : b;
        int max;
        if (a>b){
            max = a;
        } else {
            max=b;
        }
        System.out.println("最大值："+ max);
    }


}
