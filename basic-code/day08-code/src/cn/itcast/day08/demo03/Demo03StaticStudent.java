package cn.itcast.day08.demo03;
/*
注意：
根据类名称访问静态成员变量的时候，
全程 “和对象就没有关系，只和类有关系”。
 */
public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.room ="101教室";

        Student one = new Student("郭靖",20);
        System.out.println("one的姓名："+one.getName());
        System.out.println("one的年龄："+one.getAge());
        System.out.println("one的教室："+Student.room);
        System.out.println("====================");

        Student two = new Student("黄蓉",18);
        System.out.println("two的姓名："+two.getName());
        System.out.println("two的年龄："+two.getAge());
        System.out.println("two的教室："+Student.room);
        System.out.println("====================");

    }
}
