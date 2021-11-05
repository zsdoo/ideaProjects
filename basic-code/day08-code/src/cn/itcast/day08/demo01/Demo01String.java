package cn.itcast.day08.demo01;
/*
java.lang.String类代表字符串。
就是说：程序当中所有的双引号字符串，都是String类的对象。（没有new也是）

字符串特点：
1、字符串的内容永不可变。【重点】
2、正是因为字符串不可改为，所以字符串是可以共享使用的。
3、字符串效果上相当于是char[]字符数组，但底层原理是byte[]字节数组。

创建字符串的常见3+1种方式：
三种构造方法：
public String(): 创建一个空白字符串，不含有任何内容。
public String(char[ ] array):根据字符数组的内容，来创建对应的字符串。
public String(byte[] array): 根据字节数组的内容，来创建对应的字符串。
一种直接创建：
String str="hello"; //右边直接用双引号

注意：直接写上双引号，就是字符串对象。
 */
public class Demo01String {

    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();//什么内容都没有
        System.out.println("第一个字符串："+str1);
        //根据字符数组创建字符串
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第2个字符串："+str2);
        //根据字节数组创建
        byte[] byteArray = {97, 98, 99 };
        String str3 = new String(byteArray);
        System.out.println("第3个是："+str3);

        //直接创建
        String str4 = "hello";
        System.out.println("第4个是："+str4);
    }
}
