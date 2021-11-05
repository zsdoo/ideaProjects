package cn.itcast.day03.Demo03;
//标准的if...else 语句
public class Demo03IfElse {
    public static void main(String[] args) {
        int num = 14;
        if (num % 2 == 0){//如果除以2余数为0，说明是偶数
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
