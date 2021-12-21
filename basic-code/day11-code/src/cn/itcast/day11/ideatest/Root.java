public class Root {
    static {
        System.out.println("Root 静态初始化块");
    }
    {
        System.out.println("Root 普通初始化块");
    }
    public Root(){
        System.out.println("Root 无参构造器");
    }
}
