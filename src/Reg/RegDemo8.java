package Reg;

import java.util.regex.Pattern;

public class RegDemo8 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d[abc]", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); //忽略英文大小写并扩大到整个UNICODE的大小写模式
        String pattern = p.pattern();
        System.out.println(pattern);
        String str = "xyz1Auvw2brst3copq";
        String r = str.replaceAll("(?iu)\\d[abc]","*"); //第二种忽略大小写的方法(?i),扩大到整个Unicode字符集
        String[] splits = p.split(str);//分割
        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i]);
        }

        Pattern p1 = Pattern.compile("\\w$", Pattern.MULTILINE);
        String str1 = "xyz1a\nuvw2brst3copq";
        String r1 = str1.replaceAll("(?m)\\w$","*");//替换掉字符串最后一个字符'q',以及换行符前的'a'
        String r2 = str1.replaceAll(p1.pattern(),"*");
        System.out.println(r1);
        System.out.println(r2);

        Pattern p2 = Pattern.compile("a.", Pattern.DOTALL); //表示.能匹配包括换行符的所有字符
        String r3 = str1.replaceAll("(?s)a.", "*"); //字符串形式，表示.能匹配包括换行符的所有字符
        System.out.println(r3);

        Pattern p3 = Pattern.compile("a ", Pattern.COMMENTS); //忽略正则表达式里的空白字符
        String r4 = str1.replaceAll("(?x)a\\b", "*");
        //忽略正则表达式里的空白字符，通配符如\\s除外, 且所忽略的空白字符一定要出现在(?x)后,(?-x)表示模式结束
        System.out.println(r4);
    }
}
