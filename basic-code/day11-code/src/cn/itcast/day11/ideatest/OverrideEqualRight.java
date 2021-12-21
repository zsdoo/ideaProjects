public class OverrideEqualRight {
    public static void main(String[] args) {
        Person p1 = new Person("孙悟空", "123456677");
        Person p2 = new Person("孙行者", "123456677");
        Person p3 = new Person("孙悟饭", "1234599");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}



