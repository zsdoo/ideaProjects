package cn.itcast.day08.demo03;
/*
一旦用了“static关键字”，那么这样的内容不再属于对象自己，而是属于类的，
所以凡是本类的对象，都共享一份
 */
public class Demo01StaticFiled {
    public static void main(String[] args) {
        Student two =new Student("黄蓉",16);
        two.room="101教室";
        System.out.println("姓名："+two.getName()
                +"，年龄："+two.getAge()+",教室："+two.room
                +"，学号："+two.getId());

        Student one =new Student("郭靖",19);

        System.out.println("姓名："+one.getName()
                +"，年龄："+one.getAge()+",教室："+one.room
                +"，学号："+one.getId());


    }
}
