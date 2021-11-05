package cn.itcast.day08.demo04;
/*
题目：计算10.8到5.9之间，绝对值大于6或小于2。1的整数有多少个？
分析：
1 既然已经确定了范围，for循环
2 起点位置-10.8应该转换成为-10，两种办法：
  2.1 可以使用Math.ceil方法，向上取整
  2.2 强转成为int，自动舍弃所有小数位
3 每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1。
4 如何拿到绝对值：Math.abs方法。
5 一旦发现了一个数字，需要让计数器++进行统计。

备注：如果使用Math.ceil方法，-10.8可以变成-10.0。注意double也是可以++的。
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
       int num =0;
        //int count = 0; //符合要求的数量
        //(int)强转成int型，这样处理变量i就是区间之内的所有整数
        for (int i = (int) min; i< max; i++){
            int abs = Math.abs(i); //绝对值
            if (abs > 6 || abs <2.1){
                num++;
                System.out.println(i);
            }

        }

        System.out.println("总数是："+num);
    }
}
