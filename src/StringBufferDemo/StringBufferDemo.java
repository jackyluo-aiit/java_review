package StringBufferDemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("abc");
        StringBuffer hello = stringBuffer.append("hello");
        System.out.println(stringBuffer == hello);
    }
}
