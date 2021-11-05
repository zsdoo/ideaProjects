package cn.itcast.day06.demo04;
/*
当方法的局部变量和类成员的变量重名时，根据就近原则 优先使用局部变量。
如果 需要访问本类当中的成员变量，需要使用格式：
this.成员变量名
通过谁调用的方法，谁就是this!
 */

public class Person {
    String name; //我自己的名字

    //参数who 是对方的名字
    //成员变量name 是自己的名字
    public void sayHello(String name){
        System.out.println(name+",你好。我是"+this.name);
        System.out.println(this);
    }

}
