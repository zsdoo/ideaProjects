public class PrintObject {
    public static void main(String[] args) {
        int it = 65;
        float f1=65.0f;
        System.out.println(it==f1);

        char ch = 'A';
        System.out.println(it == ch);

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

    }
}
