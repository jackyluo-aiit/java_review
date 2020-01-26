package StringBufferDemo;

public class StringBufferAPI {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        sb.append(10)
                .append(1.2f)
                .append("ffff")
                .append(1.2)
                .append(new Person("Jacky", 22, 1));
        System.out.println(sb);
        StringBuffer stringBuffer = new StringBuffer("abac");
//        stringBuffer.insert(1,"BC");
//        System.out.println(stringBuffer);
//        stringBuffer.deleteCharAt(4);
//        System.out.println(stringBuffer);
//        stringBuffer.delete(2,4);
//        System.out.println(stringBuffer);
        StringBuffer stringBuffer1 = new StringBuffer("caba");
        StringBuffer reverse = new StringBuffer(stringBuffer.reverse());
        System.out.println(reverse);
        System.out.println(reverse.equals(stringBuffer));
//        System.out.println(arr);


    }
}
