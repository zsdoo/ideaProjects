package cn.itcast.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000,30,35};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果当前元素比max大，则替换
            if (array[i]>max) {
                max=array[i];
            }

        }// 谁最大，谁留在max中
        System.out.println("最大值是"+max);
    }
}
