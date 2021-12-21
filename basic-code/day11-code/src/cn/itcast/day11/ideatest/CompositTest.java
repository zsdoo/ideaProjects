public class CompositTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Bird b = new Bird(a1);
        b.breath();
        b.fly();
        Animal a2 = new Animal();
        Wolf w = new Wolf(a2);
        w.breath();
        w.run();

    }
}
class Animal{
    private void beat(){
        System.out.println("心脏跳动");
    }
    public void breath(){
        beat();
        System.out.println("吸气，吐气，呼吸中……");
    }
}
class Bird{
    private Animal a;
    public Bird(Animal a){
        this.a=a;
    }
    public void breath(){
        a.breath();
    }
    public void fly(){
        System.out.println("我在天上飞");
    }
}
class Wolf{
    private Animal a;
    public Wolf(Animal a){
        this.a = a;
    }
    public void breath(){
        a.breath();
    }
    public void run(){
        System.out.println("我在地上快速奔跑……");
    }
}

