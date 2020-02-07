package Reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo3 {
    public static void main(String[] args) {
        String str = "a1b2c3yyy";
        Pattern p = Pattern.compile("\\d");
        Matcher matcher = p.matcher(str);
        System.out.println(matcher.replaceAll("*"));  //产生一个新的字符串，因为String 不可变
        System.out.println("执行reset前:"+matcher.find());
        matcher.reset();
        System.out.println("执行reset后:"+matcher.find()); //matcher 先执行了replaceAll，并指向了最后一个字符，所以并不会搜索到,只要执行reset，就可以重新找到

        matcher.reset();
        StringBuffer stringBuffer = new StringBuffer("xxx");
        matcher.find();
        if (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "*");
            //appendReplacement: 把当前匹配项前面的，还没有添加过得那部分内容，以及当前匹配项被替换后的那个字符串，都追加到StringBuffer末尾
        }
        if (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "*");  //appendReplacement: 继续延续上次find结束后游标指向的Index开始寻找匹配项
        }
        System.out.println(stringBuffer);

        matcher.appendTail(stringBuffer);//将剩下的添加到stringbuffer
        System.out.println(stringBuffer);

        //while循环替换, 让奇数个的匹配项替换为"*",并添加到stringBuffer末尾
        stringBuffer = new StringBuffer("xxx");
        matcher.reset();
        int i = 0;
        while (matcher.find()){
            if (++i % 2 != 0) {
                matcher.appendReplacement(stringBuffer, "*");

            }
        }
        matcher.appendTail(stringBuffer);
        System.out.println(stringBuffer);
    }
}
