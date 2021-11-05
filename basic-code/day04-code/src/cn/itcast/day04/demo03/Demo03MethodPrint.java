package cn.itcast.day04.demo03;
/*
打印指定次数
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
    printCount(11);
    }
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld!"+(i+1));
        }
    }
}
