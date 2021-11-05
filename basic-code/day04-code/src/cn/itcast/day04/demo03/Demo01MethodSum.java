package cn.itcast.day04.demo03;

public class Demo01MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是："+getSum());
    }
    public static int getSum(){
        int sum=0;
        for (int i = 0; i <= 2; i++) {
            sum+=i;
        }
        return sum;
    }
}
