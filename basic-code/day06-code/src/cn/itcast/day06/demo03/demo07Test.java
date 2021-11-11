package cn.itcast.day06.demo03;


public class demo07Test {
    public static void main(String[] args) {
        int[] array={10,20,25,550,35,100,300};
        int max = getMax(array);
        System.out.println(max);


    }
    public static int getMax (int array[]) {
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
