package cn.itcast.day11.ideainterface;

public class AnonymousTest {
    public static void main(String[] args) {
        AnonymousTest ta = new AnonymousTest();
        ta.test(new Product() {
            @Override
            public String getName() {
                return "API显卡";
            }

            @Override
            public double getPrice() {
                return 567.8;
            }
        });
    }
    public void test(Product p){
        System.out.println("购买了一个"+p.getName()+ "花掉了"+p.getPrice());

    }
}


