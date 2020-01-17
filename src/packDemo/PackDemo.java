package packDemo;

public class PackDemo {
    public static void main(String[] args) {
//        Integer i = new Integer(10);
        Integer integer = new Integer("23");

        int maxValue = Integer.MAX_VALUE;
        int minValue = integer.MIN_VALUE;

        //Integer 与 int 转换
        Integer i = new Integer(10);
        int i1 = i.intValue();

        //Integer 与 String转换
        Integer integer1 = new Integer("55");//必须为数值形式

        String s = integer1+"";
        String s1 = integer1.toString();

        //int 与 String 转换
        int i3 = 20;
        String s2 = i3+"";
        int i4 = Integer.parseInt(s2);

        //十六进制转换
        String s3 = Integer.toHexString(i3);
        System.out.println(s3);

        Integer integer2 = new Integer(29);
        Integer integer3 = new Integer(29);
        //不相同, 是两个不同的对象的引用，因此地址不同
        System.out.println(integer2==integer3);
        //推荐方法
        System.out.println(integer2.intValue() == integer3.intValue());
        System.out.println(integer2.equals(integer3));



    }
}
