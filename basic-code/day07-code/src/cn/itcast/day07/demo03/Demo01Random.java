package cn.itcast.day07.demo03;

import java.util.Random;

/*
Random类用来生长随机数字。使用起来也是三个步骤
1 导包
import java.util.Random;

2 创建
Random r = new Random(); //小括号中留空

3 使用
获取一个随机的int数字(范围int所有的范围，有正负两种)：int num = r.nextInt();
获取一个随机的int数字(范围左闭右开区间)：int num = r.nextInt(3);
[0,3) 实际的范围是：0~2

 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是："+num);
    }
}
