package cn.itcast.day05.demo03;
/*
遍历数组，说的是每一个元素，逐一打印。
# array.fori #
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array={15,25,30,40,50,60,75};
        //System.out.println(array[0-5]);

        //使用循环
        for (int i=0; i<6; i++){
            System.out.println(array[i]);
        }
        System.out.println("================");


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
