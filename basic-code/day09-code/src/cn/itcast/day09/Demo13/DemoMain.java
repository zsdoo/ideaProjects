package cn.itcast.day09.Demo13;

public class DemoMain {
    public static void main(String[] args) {
//        Animal animal= new Animal;
//        Dog dog = new Dog();

        Dog2Ha ha = new Dog2Ha();
        ha.eat();
        ha.sleep();
        System.out.println("=============");

        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
    }
}
