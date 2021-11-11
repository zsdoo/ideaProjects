package cn.itcast.day06;

public class test1110 {
    public static void main(String[] args) {
        int[] a = {5,6,7,8};
        String[] objArr={"java","李刚"};
//        System.out.println(objArr[0]);
        Object[] books = new String[4];
        books[1]="String";
//        System.out.println(books[5]);
        for (String objArrs: objArr
             ) {
            System.out.println(objArrs);
        }
    }
}
