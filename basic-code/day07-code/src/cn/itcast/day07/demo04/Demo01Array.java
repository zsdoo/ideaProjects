package cn.itcast.day07.demo04;
/*
题目：
定义一个数组，用来存储3个Person对象
数组有一个缺点：一理创建，程序运行期间长度不可改变
 */
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        //首先创建一个长度为3的数组，里面用来存放Person类的对象

        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("玛尔扎哈",38);
        //将one当中的地址值赋值到数组的0号元素位置
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        Person person=array[1];
        System.out.println(array[1].getName()); //
        System.out.println("-------------");
    }
}
