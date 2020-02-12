package packDemo;

public class packDemo2 {
    public void add(Byte b) {
        b = b++;
    }

    public void test() {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + "");
        add(b);
        System.out.print(b + "");
    }

    public static void main(String[] args) {
        packDemo2 packDemo2 = new packDemo2();
        packDemo2.test();
    }
}
