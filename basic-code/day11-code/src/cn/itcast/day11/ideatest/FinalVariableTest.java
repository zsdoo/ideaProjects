public class FinalVariableTest {
    final  int a = 6;
    final String str;
    final int c;
    final static double d;
    {
        str= "hello";
//        a=9;

    }
    static {
        d=5.6;
    }
    public FinalVariableTest() {
        c=5;
    }

    public static void main(String[] args) {
        FinalVariableTest ft1=new FinalVariableTest();
        System.out.println(ft1.a);
        System.out.println(ft1.c);
        System.out.println(ft1.d);
        final String aa;
        aa="hello!";
        System.out.println(aa);
    }
    public static void testabc(){
        final int a;
        a=33;
        System.out.println(a);

    }

}
