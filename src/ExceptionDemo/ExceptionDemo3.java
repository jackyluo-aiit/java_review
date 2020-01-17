package ExceptionDemo;

public class ExceptionDemo3 {
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
        } finally {
            System.out.println("Always be executed");
        }
        return c;
    }
}
