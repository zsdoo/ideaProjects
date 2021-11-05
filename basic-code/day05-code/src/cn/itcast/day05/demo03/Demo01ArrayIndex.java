package cn.itcast.day05.demo03;
/*
数组的索引编号从0开始，一直到“数组长度-1”为止
如果数组索引编号不存在，将发生越界异常
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array={15,25,35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //错误写法
        System.out.println(array[3]);
    }
}
