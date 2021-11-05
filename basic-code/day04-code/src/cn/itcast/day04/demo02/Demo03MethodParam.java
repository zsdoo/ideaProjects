package cn.itcast.day04.demo02;
/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务。
        例如：两个数字相加，必须知道两个数各是多少，才能相加。
无参数：小括号当中留空。不需要任何参数就能完成任务。
        例如定义一个方法，打印固定10次helloworld.

 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10,20);
        System.out.println("====================");
        method2();
    }
    //两个数字相乘，必须知道两个具体数。有参数
    public static void method1(int a, int b){
        int result =a * b;
        System.out.println("结果是："+result);
    }

    //无参数：打印10次文本
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld"+i);
        }
    }
}
