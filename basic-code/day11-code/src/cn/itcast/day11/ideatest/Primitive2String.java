public class Primitive2String {
    public static void main(String[] args) {
        String inStr = "123";
        int it1=Integer.parseInt(inStr);
        int it2=Integer.valueOf(inStr);
        System.out.print(it1);
        System.out.println(it2);

        String floatStr="4.56";
        float ft1= Float.parseFloat(floatStr);
        float ft2= Float.valueOf(floatStr);
        System.out.println(ft1);
        System.out.println(ft2);

        String ftStr = String.valueOf(2.345f);
        System.out.println(ftStr);

        String dtStr = String.valueOf(4.334);
        System.out.println(dtStr);

        String boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());
    }
}
