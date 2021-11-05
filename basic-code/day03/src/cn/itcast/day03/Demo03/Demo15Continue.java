package cn.itcast.day03.Demo03;

public class Demo15Continue {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            if(i==4){
                continue;
                //break;
            }
            System.out.println(i+"层到了。");
        }
    }
}
