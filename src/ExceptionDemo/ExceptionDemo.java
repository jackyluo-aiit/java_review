package ExceptionDemo;

public class ExceptionDemo {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = divide(10, 0);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Could not divide 0...modify the 0 to 1:");
            result = divide(10, 1);
        }
//        System.out.println("caller side");
        System.out.println(result);
    }
    public static int divide(int a,int b){
        int c = 0;
        c = a/b;
//        System.out.println("After the runtime exception");
        return c;
    }
}
