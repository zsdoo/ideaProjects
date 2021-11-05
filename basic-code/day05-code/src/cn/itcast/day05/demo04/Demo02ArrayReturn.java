package cn.itcast.day05.demo04;

/*
一个方法可以有0，1多个参数，只能有一个参数。
如果希望一个方法产生多个结果进行返回，可以使用数组作为返回值类型

 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] ddd=calculate(10,20,30);
        System.out.println("main方法接收的返回值地址是");
        System.out.println(ddd); //地址值

        System.out.println("总和："+ddd[0]);
        System.out.println("平均数："+ddd[1]);
    }
    public static int[]  calculate(int a, int b, int c){
        int sum=a+b+c;
        int avg=sum /3;  //两个结果都想返回
        //需要一个数组，可以保存多个结果
        /*int[] array = new int[2];
        array[0]=sum;
        array[1]=avg;*/
        int[] array ={sum,avg};
        System.out.println("calculate方法内部数组地址是");
        System.out.println(array); //地址值
        return array;
    }
}
