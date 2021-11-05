package cn.itcast.day05.demo01;
/*
使用静态初始化，格式可以活省略一下。
标准格式：
数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，...};

省略格式：
数数据类型[] 数组名称 = {元素1，元素2，...};

注意事项：
静态初始化标准格式可以折分为两个步骤(省略格式不能拆分)
动态初始化也可以折分为两个步骤
 */
public class Demo03Array {
    public static void main(String[] args) {
        int[] arrayA={10,20,30};

        //静态初始化标准格式可以折分为两个步骤
        int[] arrayB;
        arrayB = new int[]{11,21,31};

        //动态初始化也可以折分为两个步骤
        int[] arrayC;
        arrayC = new int [5];
    }
}
