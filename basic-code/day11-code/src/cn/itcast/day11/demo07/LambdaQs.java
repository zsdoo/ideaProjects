package cn.itcast.day11.demo07;

interface Eatable{
    void taste();
}
interface Flyable{
    void fly(String weather);
}
interface Addable{
    int add(int a, int b);
}
public class LambdaQs {

    public void eat(Eatable e){
        System.out.println(e);
        e.taste();
    }
    public void drive(Flyable f){
        System.out.println("我正在驾驶"+f);
        f.fly("【碧空如洗】");
    }
    public void test(Addable ad){
        System.out.println("5与3的和为：" + ad.add(5,3));
    }
    public static void main(String[] args) {
        LambdaQs lq=new LambdaQs();
        lq.eat(new Eatable() {
            @Override
            public void taste() {
                System.out.println("苹果的味道不错");
            }
        });
        lq.eat(()-> System.out.println("苹果的味道很不错"));
        System.out.println("==================");

        lq.drive(weather -> {
            System.out.println("今天天气是："+weather);
            System.out.println("直升机平衡");
        });
        System.out.println("==================");

        lq.test(((a, b) -> a+b));
    }
}
