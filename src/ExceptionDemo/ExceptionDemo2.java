package ExceptionDemo;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int result = 0;
        result = divide(10, 1);
        System.out.println(result);
    }

    public static int divide(int a, int b) {
        int c = 0;
        int[] arr = {1,3,5,6,7};
        try {
            c = a / b;
            System.out.println(arr[100]);
        } catch (ArithmeticException e) {
            System.out.println("Could not handle 0-divide");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        } finally {
            System.out.println(arr[0]);
            System.out.println("ended");
        }
//        System.out.println("After the runtime exception");
        return c;
    }
}
