package ExceptionDemo;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int result = 0;
        result = divide(10, 0);
        System.out.println(result);
    }

    public static int divide(int a, int b) {
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e) {
            System.out.println("Could not handle 0-divide");
        }
//        System.out.println("After the runtime exception");
        return c;
    }
}
