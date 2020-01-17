package packDemo;

public class PackDemo1 {
    public static void main(String[] args) {
        int i = 10;
        //自动装箱
        Integer it = i;
        System.out.println(it);

        //自动拆箱
        Integer integer = new Integer(23);
        int i1 = integer;
        System.out.println(i1);
    }
}
