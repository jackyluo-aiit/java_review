package ExceptionDemo;

import java.io.IOException;

public class ExceptionDemo6 {
    public static void main(String[] args) throws IOException {
        try {
            submitOrder(6);
        } catch (Exception e) {
            System.out.println("Got that");
            submitOrder(5);
        }
    }

    public static void submitOrder(int stock){
        if(stock > 5){
            throw new CustomException("stock not enough");
        }
        System.out.println("order success");
    }
}
