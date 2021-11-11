package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person= new Person();
        person.show();

        person.setName("赵丽");
//        person.age=-20; //直接访问private内容，错误写法！
        person.setAge(50);
        person.show();
    }
}
