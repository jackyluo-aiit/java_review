package Reg;

public class RegDemo1 {
    public static void main(String[] args) {
        String s = "afjdklfjlure3eghdjlr3eiojyr3teu";
        String r = s.replaceAll("\\de","--");
        System.out.println(r);

        String s1 = "你1好2%……￥%**（*abc以及A_B&&";
        String r1 = s1.replaceAll("\\W","-");//除了数字，字母，_都被替换
        String s2 = s1.replaceAll("\\w", "@");
        System.out.println(r1);
        System.out.println(s2);

        String s3 = "7ab3ekjl8k[jla]jeiu-6ajl";
        String r2 = s3.replaceAll("a.\\d", "---");
        System.out.println(r2);

        String r3 = s3.replaceAll("[abcd]", "-");//自定义通配符匹配abcd中的一个，每次只能匹配一个
        System.out.println(r3);

        String r4 = s3.replaceAll("[a-di-u]", "*"); //两组通配符：a-d,和i-u
        System.out.println(r4);

        String r5 = s3.replaceAll("[0-9\\-]", "&");//匹配0-9 和 -
        System.out.println(r5);

        String r6 = s3.replaceAll("[]x]", "^"); //要匹配']'，必须要写在自定义通配符的最前面，或者在']'前加上'\\'将它变成转义字符
        System.out.println(r6);

        String r7 = s3.replaceAll("[x\\[]", "^"); //要匹配'['，必须要写在自定义通配符的最前面，或者在'['前加上'\\'将它变成转义字符
        System.out.println(r7);

        String r8 = s3.replaceAll("[^abcd]", "-");//'^'自定义通配符匹配除了abcd中的一个
        System.out.println(r8);
    }
}
