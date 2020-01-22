package File;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fn(3));
    }

    public static int fn(int num){
        if(num <= 1){
            return num;
        }
        return num*fn(num-1);
    }
}
