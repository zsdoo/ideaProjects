class Test111202 {
    public int a = 5;
}

class Subclass extends Test111202 {
    public int a = 7;

    public void accessOwner() {
        System.out.println(a);
    }

    public void accessBase() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Subclass sc = new Subclass();
        sc.accessOwner();
        sc.accessBase();
    }
}
