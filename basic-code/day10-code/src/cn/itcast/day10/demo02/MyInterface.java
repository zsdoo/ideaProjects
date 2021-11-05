package cn.itcast.day10.demo02;

public interface MyInterface {
//    错误写法！接口中不能有静态代码块
//    static {
//
//    }
//
//    错误写法！接口中不能构造方法
//    public Myinterface(){
//
//    }

    public default void method(){
        System.out.println("接口当中的默认方法");
    }
}
