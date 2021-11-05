package cn.itcast.day05.demo01;
/*
访问数组元素的格式：数组名称[索引值]
索引值从0开始，一直到数组的长度-1为止。
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] array ={10,20,30};
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //将数组赋值给变量
        int num = array[1];
        System.out.println(num);
    }

}
