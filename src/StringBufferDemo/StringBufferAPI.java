package StringBufferDemo;

public class StringBufferAPI {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        sb.append(10)
                .append(1.2f)
                .append("ffff")
                .append(1.2)
                .append(new Person("Jacky", 22));
        System.out.println(sb);
        StringBuffer stringBuffer = new StringBuffer("ADH");
        stringBuffer.insert(1,"BC");
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(4);
        System.out.println(stringBuffer);
        stringBuffer.delete(2,4);
        System.out.println(stringBuffer);
        
    }
}
