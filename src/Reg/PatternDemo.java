package Reg;

import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d[abc]"); //定义了一个正则表达式：数字+abc其中一个
        String pattern = p.pattern();
        System.out.println(pattern);
        String str = "xyz1auvw2brst3copq";
        String[] splits = p.split(str);//分割
        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i]);
        }
        boolean matches = Pattern.matches("\\d[abc]", "3a");
        System.out.println(matches);
        String quote = Pattern.quote("\\d[abc]");//将正则表达式加入特殊字符失效区
        System.out.println(quote);
    }
}
