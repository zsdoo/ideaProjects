package cn.itcast.day04.demo02;
/*
定义格式：
public static void 方法名称（）{
    方法体
}
调用格式：
方法名称（）；
 注意事项：
 1 方法定义的先后顺序无所谓  2 方法定义必须是挨着的，不能套
 3 方法定义之后，自己不会执行，要进行方法调用。
 */
public class Demo01Method {
    public static void main(String[] args) {
    printMethod();
    }
    public static void printMethod(){
        for (int j = 0; j < 5; j++) {
            for(int i =1; i<=20; i++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
