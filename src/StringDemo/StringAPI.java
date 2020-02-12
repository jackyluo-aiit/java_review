package StringDemo;

import java.util.Arrays;

public class StringAPI {
    public static void main(String[] args) {
        String s = "helloworld";
        int len = s.length();
        System.out.println(len);


        char c = s.charAt(3);
        System.out.println(c);
        //获得所求字符第一次出现的地方
        int w = s.indexOf('l');
        System.out.println(w);
        int el = s.indexOf("el");
        System.out.println(el);//1
        //获取从4开始，'o'第一次出现的位置
        int o = s.indexOf("o", 4);
        System.out.println(o);
        //从5开始取子串和从1开始取到4（包头不包尾）
        String substring = s.substring(5);
        String substring1 = s.substring(1, 5);
        System.out.println(substring);
        System.out.println(substring1);
        //获取对应字符组成的数组(对应的ASCII)
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        //获取对应字符组成的字符数组
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        //拆分字符串
        String test = "aaa-bbb-cddc";
        String[] split = test.split("\\-");//'\\'是表示转义符
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //替换某种字符
        String m = test.replace('-', 'm');
        System.out.println(m);
        String replace = test.replace("aaa", "yyy");
        System.out.println(replace);
        //去掉两边空格
        String trimString = "   abc    ";
        String trim = trimString.trim();
        System.out.println("|"+trim+"|");

        String s1 = ".16.254.1";
        String[] sub = s1.split("\\.");
        String s2 = sub[sub.length-1];
        System.out.println(sub.length);



    }
}
