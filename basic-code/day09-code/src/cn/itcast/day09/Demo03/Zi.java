package cn.itcast.day09.Demo03;

public class Zi extends Fu {
    int num = 20;
    public void method(){
        int num =30;
        System.out.println(num); // 30 局部变量
        System.out.println(this.num); //20本类成员变量
        System.out.println(super.num); //10父类成员变量
    }
}
