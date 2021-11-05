package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04Random {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100)+1; //[1,100]
        Scanner sc =new Scanner(System.in);

        while (true) {
            System.out.println("请输入你请猜测的数字：");
            int gussNum = sc.nextInt();

            if (randomNum<gussNum) {
                System.out.println("太大了，请重试。");
            } else if (randomNum>gussNum){
                System.out.println("太小了，请重试");
            } else {
                System.out.println("恭喜你，猜中啦!");
                break; //如果猜中，不再重试
            }
        }
        System.out.println("游戏结束");
        }

}
//day 07 第12集完