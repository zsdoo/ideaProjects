public class NullAccessStatic {

    public static void test(String name){

        System.out.println(name);
    }
    public static void main(String[] args) {
        NullAccessStatic s1 = null;
        s1.test("孙者行");
    }
}
