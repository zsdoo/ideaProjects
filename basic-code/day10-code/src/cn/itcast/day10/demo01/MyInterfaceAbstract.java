package cn.itcast.day10.demo01;
/*
任何版本的java中，接口都能定义抽象方法。
格式：
public abstract 返回值类型 方法名称（参数列表）；//不写大括号
注意：
1 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2 修饰符可省略或省略任何一个。（今天新学，所以不推荐）
3 方法的三要素，可以随意定义。
 */
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract void methondAbs1();
    //这是一个抽象方法(修饰符省略了）
    public void methodAbs2();
    abstract void methodAbs3();
    void methodAbs4();
}
