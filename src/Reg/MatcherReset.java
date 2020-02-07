package Reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherReset {
    public static void main(String[] args) {
        String str = "0xxxa1b2c3yyy9";
        Pattern p = Pattern.compile("\\d");
        Matcher matcher = p.matcher(str);

//        matcher.reset("abcedf"); //重置目标字符串
        matcher.find();
        matcher.find();
        System.out.println(matcher.group());

        Pattern p2 = Pattern.compile("[abc]");
        matcher.usePattern(p2);//重置matcher 的 Pattern，此时matcher 并不会回到目标字符串的开头重新找
        matcher.find();
        System.out.println(matcher.group());
    }
}
