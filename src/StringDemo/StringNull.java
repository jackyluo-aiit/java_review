package StringDemo;

public class StringNull {
    public static void main(String[] args) {
        String s1 = "abc";
        String str = null;
        String s2 = "abc";
        System.out.println(s1.equals(s2));
        System.out.println(str.equals(s1));
    }
}
