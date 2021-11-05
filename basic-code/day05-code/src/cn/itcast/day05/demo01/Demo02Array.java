package cn.itcast.day05.demo01;
/*
动态初始化（指定长度）：在创建数组的时候，直接指定数组当中的数据元素个数
静态初始化（指定内容）：在创建数组的时候，不指定个数，直接指定内容。

动态初始化数组的格式：
数据类型[] 数组名称 = new 数据类型[数组长度]；

静态初始化基本格式：
数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，...};
注意：静态虽然没有指定长度，但是是有长度的

 */
public class Demo02Array {
    public static void main(String[] args) {
        //直接创建一个数组，装的是int数字：5、15、25
        int[] arrayA = new int[] {5,15,25};

        //装字符串：“hello world Java"
        String[] arrayB = new String[]{"hello","world","java"};
    }
}
