package cn.itcast.day10.demo03;
/*
这个子接口当中有几个方法？答：4个。
methodA 来源于接口A
methodB           B
methodCommon        A/B
method             自己
 */
public interface  MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}
