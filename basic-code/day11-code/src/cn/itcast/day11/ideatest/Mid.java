public class Mid extends Root {
    static {
        System.out.println("Mid 静态初始化块");
    }
    {
        System.out.println("MId普通初始化块");
    }
    public Mid(){
        System.out.println("MId无参构造器");
    }
    public Mid(String msg){
        this();
        System.out.println("Mid带能数，其参数是"+msg);
    }
}
