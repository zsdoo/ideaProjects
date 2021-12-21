public interface InterfaceExtendsTest {
    interface interfaceA{
        int prop_A=5;
        void testA();
    }
    interface interfaceB{
        int prop_B=6;
        void testB();
    }
    interface interfaceC extends interfaceA,interfaceB{
        int prop_C=7;
        void testC();
    }

    public static void main(String[] args) {
        System.out.println(interfaceC.prop_C);
//        System.out.println(interfaceC.prop_B);
//        System.out.println(interfaceC.prop_C);
    }
}
