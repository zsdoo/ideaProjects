package cn.itcast.day03.Demo03;

public class Demo17LoopHourAndMinute {
    public static void main(String[] args) {
        for (int hour=0;hour<24; hour++){
            for (int minute=0; minute<59; minute++){
                for(int seconde=0;seconde<59; seconde++){
                    System.out.println(hour+"点"+minute+"分"+seconde+"秒");
                }
            }
        }
    }
}
