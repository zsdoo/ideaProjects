package cn.itcast.day05.demo03;

public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000,-20,30,35};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果当前元素比min小，则替换
            if (array[i]<min) {
                min=array[i];
            }

        }// 谁最大，谁留在max中
        System.out.println("最小值是"+min);
    }
}
