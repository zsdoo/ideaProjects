public class OverrideEqualsError {
    static class int5{
        private int int1=8;

        public void setInt1(int int1) {
            this.int1 = int1;
        }

        public int getInt1() {
            return int1;
        }
    }
    public static void main(String[] args) {

        int5 int6=new int5();
        int6.setInt1(8);
        System.out.println(int6.getInt1());


    }



}
