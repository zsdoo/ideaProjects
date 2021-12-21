public class StringCompareTest {
    public static void main(String[] args) {
        String s1 = "疯狂JAVA";
        String s2 = "疯狂";
        String s3 = "JAVA";
        String s4 = "疯狂"+"JAVA";
        String s5 = "疯" + "狂" + "JAVA";
        String s6 = s2 + s3;
        String s7 = new String("疯狂JAVA");
        System.out.println(s1 == s4); // true
        System.out.println(s1 == s5); // true
        System.out.println(s1 == s6); // false
        System.out.println(s1 == s7); // false
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
        System.out.println(s1.equals(s7));
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // true
        System.out.println(str1 == str2);
    }
}
