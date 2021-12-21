public class Leaf extends Mid {
    static {
        System.out.println("Leaf 静态初始化块");
    }
    {
        System.out.println("Leaf 普通初始化块");
    }

    public Leaf(){
        super("疯狂JAVA讲义");
        System.out.println("执行leaf构造器");
    }
}
