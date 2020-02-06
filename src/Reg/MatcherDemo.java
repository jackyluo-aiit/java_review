package Reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {
    public static void main(String[] args) {
        String s = "1adfae423aefs";
        Pattern p = Pattern.compile("\\d\\w");
        Matcher m = p.matcher(s); //p将自己当成参数传入Matcher的构造函数
        System.out.println(m.pattern());

        System.out.println(m.matches());

        System.out.println(m.lookingAt()); //判断目标字符串的开头是否匹配

        System.out.println(m.find());//判断是否找到匹配的字符串
        if (m.find(9)) {//在Index=9的位置开始搜索
            System.out.println(m.group());
        }

        m.reset();//重置m到初始位置index = 0

        while(m.find()){
            System.out.println("Current match: "+m.group());
            System.out.println("Current match start: "+m.start());
            System.out.println("Current match end: "+m.end());//返回的是当前匹配项的下一个Index
        }

    }
}
