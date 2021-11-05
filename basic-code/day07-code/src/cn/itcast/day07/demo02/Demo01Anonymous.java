package cn.itcast.day07.demo02;

/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称（）;

注意：
匿名对象只能使用唯一的一次，下次要重新创建。
使用建议：当只需要使用唯一的一次时，可以用匿名对象。
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        //左边的one就是对象的名字
        Person one = new Person();
        one.name = "高圆圆";
        one.showName(); //我叫高圆圆
        System.out.println("================");

        //匿名对象
        new Person().name = "赵又廷";
        new Person().showName(); // ?

    }
}
