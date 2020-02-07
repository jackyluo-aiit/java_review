package Reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherSearch {
    public static void main(String[] args) {
        String str = "0xxxa1b2c3yyy9";
        Pattern p = Pattern.compile("\\d");
        Matcher matcher = p.matcher(str);
        matcher.region(4, 9); //限定搜索范围 包头不包尾
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println(matcher.find(0)); //如果有传参，以传参为准，而且往后的所有find()都会被reset.

        System.out.println(matcher.regionStart());
        System.out.println(matcher.regionEnd());

        System.out.println(matcher.replaceFirst("*")); //对replaceFirst,replaceAll方法没有影响



        Pattern p1 = Pattern.compile("^a");
        Matcher matcher1 = p1.matcher(str);
        matcher1.region(4, 9);
        System.out.println(matcher1.find());
        matcher1.useAnchoringBounds(false); //不再以region定的范围为字符串的首尾
        System.out.println(matcher1.find());

        Pattern p2 = Pattern.compile("\\ba");
        Matcher matcher2 = p2.matcher(str);
        matcher2.region(4,9);
        System.out.println(matcher2.find());
        matcher2.useTransparentBounds(true); //不再将字符串开头看做空白字符
        System.out.println(matcher2.find());
    }
}
