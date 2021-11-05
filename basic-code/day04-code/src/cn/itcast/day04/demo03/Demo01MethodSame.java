package cn.itcast.day04.demo03;
/*
定义一个方法，用来判断两个数字是否相等。
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20)); //false
        System.out.println(isSame(20,20)); //true
        System.out.println(isSame(20,10));
    }
    /*
    三要素：
    返回值类型；boolean
    方法名称：isSame
    参数列表：int a, int b
     */
    public static boolean isSame(int a,int b){
        boolean same;
        /*if (a==b){
            same=true;
        } else {
            same=false;
        }*/
        // same =a ==b ? ture : false;
        // boolean same = a == b;
        return a == b;

    }
}
