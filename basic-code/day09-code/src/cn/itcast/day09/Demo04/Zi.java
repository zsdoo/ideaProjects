package cn.itcast.day09.Demo04;

import org.w3c.dom.ls.LSOutput;

public class Zi extends Fu {
    public void methodZi(){
        System.out.println("子类方法执行！");
    }
    public void method(){
        System.out.println("子类重名方法执行！");
    }
}
