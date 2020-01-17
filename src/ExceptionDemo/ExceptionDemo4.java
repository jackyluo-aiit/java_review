package ExceptionDemo;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int result = 0;
        result = divide(10, 0);
//        System.out.println("caller side");
        System.out.println(result);
    }

    public static int divide(int a, int b) {
        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            c = 4;
            return c;
        } finally {
            System.out.println("Always be executed");
            c = 5;
            return c;
        }
//        return c;
    }
}
