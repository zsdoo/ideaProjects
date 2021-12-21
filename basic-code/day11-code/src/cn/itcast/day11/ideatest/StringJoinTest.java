public class StringJoinTest {
    public static void main(String[] args) {
        String s1 = "疯狂Java";
        String s2 = "疯狂"+"Java";
        final String st1 = "疯狂Java";
        final String st2 = "疯狂"+"Java";
        final String s3 = st1 + st2;
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
