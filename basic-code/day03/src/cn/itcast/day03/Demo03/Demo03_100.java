package cn.itcast.day03.Demo03;

public class Demo03_100 {
    public static void main(String[] args) {
        int m=0;
        for (int i = 1; i <= 200; i++) {
            if (i%2==0){
                m=m+i;
            }

        }
        System.out.println(m);

    }
}
