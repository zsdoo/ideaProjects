package cn.itcast.day11.ideainterface;

public interface Output {
    int MAX_CASHE_LINE = 50;
    void out();
    void getDate(String msg);
    default void print(String... msgs){
        for (String msg : msgs){
            System.out.println(msg);
        }
    }
    default void test(){
        System.out.println("默认的test方法");
    }
    static String staticTest(){
        return "Output接口里类方法";
    }
    private void foo(){
        System.out.println("foo 私有方法");
    }
    private static void bar(){
        System.out.println("bar静态私有方法");
    }
}
