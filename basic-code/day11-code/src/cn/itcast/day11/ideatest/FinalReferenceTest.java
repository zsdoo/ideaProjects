import java.util.Arrays;

public class FinalReferenceTest {
    public static void main(String[] args) {
        final int[] iArr = {5,6,12,9};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        iArr[2] = -8;
        System.out.println(Arrays.toString(iArr));
        Persona27 p = new Persona27();
        p.setAge(23);
        System.out.println(p.getAge());

    }

}
class Persona27{
    private int age;
    public Persona27(){}
    public Persona27(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}