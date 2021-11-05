package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r= new Random();
        for (int i = 0; i < 20; i++) {
            int num =r.nextInt(100)+1; //1~100
            bigList.add(num);
        }

        ArrayList<Integer>smallList = getSmallList(bigList);
        System.out.println("偶数总共有多少个："+smallList.size());

        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    //这个方法，接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer>bigList){
        //创建一个小集合，用来装 偶数结果
        ArrayList<Integer> smallList =new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num =bigList.get(i);
            if(num % 2 ==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
