package cn.itcast.day10.demo02;

public interface MyInterfaceA {
    //错误写法!接口不能有静态代码块，如下：
//    static {
//    }

    //错误！接口不能有构造方法
//    public MyInterface(){
//
//    }
    public abstract void methodA();
    public abstract void methodABS();
    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
