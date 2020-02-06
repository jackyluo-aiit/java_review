package Reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo2 {
    public static void main(String[] args) {
        String str = "abc1234";
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            //在找到匹配项，并且hitEnd()返回true，说明在末尾再增加一个字符可能会产生不同的结果
            System.out.println(matcher.hitEnd());
        }

        String str1 = "abc";
        Pattern p1 = Pattern.compile("\\d+");
        Matcher matcher1 = p1.matcher(str1);
        if (matcher1.find()==false) {
            //在找不到匹配项，并且返回true，说明在末尾再增加一个字符可能会产生不同的结果
            System.out.println(matcher1.hitEnd());
        }

        String str2 = "1234a";
        Pattern p2 = Pattern.compile("\\d+");
        Matcher matcher2 = p2.matcher(str2);
        if (matcher2.find()) {
            //在找到匹配项，并且返回false，说明再末尾再增加一个字符不会产生新的匹配结果
            System.out.println(matcher2.hitEnd());
        }

        String str3 = "abc";
        Pattern p3 = Pattern.compile("^\\d+");
        Matcher matcher3 = p3.matcher(str3);
        if (matcher3.find()==false) {
            //在找不到匹配项，并且返回false，说明再末尾再增加一个字符不会产生新的匹配结果
            System.out.println(matcher3.hitEnd());
        }

        String str4 = "1234";
        Pattern p4 = Pattern.compile("\\d+$");
        Matcher matcher4 = p.matcher(str4);
        if (matcher4.find()) {
            //若返回true，则表明在字符串后增加字符可能导致匹配结果丢失
            System.out.println(matcher4.requireEnd());
        }

        String str5 = "1234";
        Pattern p5 = Pattern.compile("\\d+");
        Matcher matcher5 = p.matcher(str5);
        if (matcher5.find()) {
            //若返回false，则表明在字符串后增加字符可能导致匹配结果不会丢失，但结果有可能产生变化
            System.out.println(matcher5.requireEnd());
        }


    }
}
