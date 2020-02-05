package Reg;

public class RegDemo5 {
    public static void main(String[] args) {
        String s = "aaayyyaaayyyaaa";
        String r = s.replaceAll("^aaa","*"); //^表示匹配字符串开头的字符，只有放在表达式开头才有用。
        System.out.println(r);

        String r1 = s.replaceAll("aaa$", "*"); //$表示匹配字符串结尾的字符
        System.out.println(r1);

        String r2 = s.replaceAll("^aaa|aaa$", "*");//同时匹配开头和结尾
        System.out.println(r2);

        String s2 = "win a window";
        String r3 = s2.replaceAll("win\\b", "*");//空白字符匹配, 定位符，表示匹配的是右边有空白字符的'win'
        System.out.println(r3);

        String s3 = "aaa aaa";
        String r4 = s3.replaceAll("a\\b", "*");//字符串开头结尾都会被判断为空白字符，定位符，表示左边有空白字符的'a'都会被匹配
        System.out.println(r4);

        String r5 = s3.replaceAll("a\\s", "*");//表示一个'a'和右边有空白字符作为一个整体被匹配，不是定位符
        System.out.println(r5);

    }
}
