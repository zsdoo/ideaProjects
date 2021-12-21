public class Test1112 {
    private String name="李刚";
    private static double price=78.0;

    public static void main(String[] args) {
        int price=65;
        System.out.println(price);
        System.out.println(Test1112.price);
        new Test1112().info();
    }
    public void info(){
        String name = "空空";
        System.out.println(name);
        System.out.println(this.name);
    }
}
