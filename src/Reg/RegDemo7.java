package Reg;

public class RegDemo7 {
    public static void main(String[] args) {
        String s = "123abba456cdcd789effe00qweeee";
        String r = s.replaceAll("(.)(.)\\2\\1", "*");
        System.out.println(r);

        String r1 = s.replaceAll("(.)\\1{3,}", "*"); //表示一号表达式，即括号内，要出现最少3次，总共就是要出现最少4次
        System.out.println(r1);

        String s1 = "aba#ababcc";
        String r2 = s1.replaceAll("((a)b)\\1", "*");//首先匹配最外层的括号
        System.out.println(r2);

        String r3 = s1.replaceAll("((a)b)(c)\\2", "*");//然后再是嵌套在内的括号
        System.out.println(r3);

        String r4 = s1.replaceAll("(?:(?:a)b)(c)\\1", "*");//?:标记不需要被编号的括号
        System.out.println(r4);

        String r5 = s1.replaceAll("(?:(?:a)b)(?<work>c)\\k<work>", "*");//?:标记需要的的括号并起名
        System.out.println(r5);

    }
}
