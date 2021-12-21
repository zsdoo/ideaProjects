 class Singleton {
    private static Singleton instance;
    private Singleton(){}
    String name = "11";
    public static Singleton getInstance(){
        if (instance == null){
            instance=new Singleton();
        }
        return instance;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s2.name="33";
        System.out.println(s1.name );
        System.out.println(s2.name );

    }
}
