package Reg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo1 {
    public static void main(String[] args) {
        String s = "1adfae423aefs";
        Pattern p = Pattern.compile("(\\d)(\\w)");
        Matcher m = p.matcher(s); //p将自己当成参数传入Matcher的构造函数
        System.out.println(m.groupCount());//正则表达式所分的组数

        while (m.find()) {
            System.out.println("Current match group 2:"+m.group(2)); //获取第2组的内容(\\w)
            System.out.println("Current match group 2 start from: "+m.start(2));
            System.out.println("Current match group 2 end at: "+m.end(2));
        }

        m.reset();
        System.out.println("---------------------------");
        MatchResult mr = null;
        ArrayList<MatchResult> mrList = new ArrayList<>();
        while (m.find()) {
            mr = m.toMatchResult();//将获得的封装在一个对象中
            mrList.add(mr);
        }
        Iterator<MatchResult> iterator = mrList.iterator();
        while(iterator.hasNext()) {
            MatchResult matchResult = iterator.next();
            System.out.println("Current match group 1: " + matchResult.group(1));
            System.out.println("Current match group 1 start from: "+matchResult.start(1));
            System.out.println("Current match group 1 end at: "+matchResult.end(1));
        }
    }
}
