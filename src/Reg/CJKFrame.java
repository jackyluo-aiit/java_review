package Reg;

import java.util.Scanner;

public class CJKFrame {
    private boolean withChinese0(String content){
        boolean flag = false;
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (c >= 0X4E00  && c <= 0X9FBF){
                flag = true;
                break;
            }
        }
        return flag;
    }

    private boolean withChinese1(String content){
        /*
        用正则表达式, 此方法会产生大量字符串，速度比较慢
         */
        boolean flag = false;
        String temp = "";
        for (int i = 0; i < content.length(); i++) {
            temp = content.substring(i,i+1);
            if (temp.matches("[\\u4e00-\\u9FBF| \\u2000-\\u206F | \\u3000-\\u303F|\\uFF00-\\uFFEF]")) {  //判断中文字或者中文标点
                flag = true;
                break;
            }
        }
        return flag;
    }

    private boolean withChinese2(String content){
        /*
        只能判断汉字，不能判断标点
         */
        boolean flag = false;
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            Character.UnicodeScript of = Character.UnicodeScript.of(c);  //调用Character内部的静态枚举类的of方法
            if (of ==  Character.UnicodeScript.HAN) { //判断字符是属于汉字HAN
                flag = true;
                break;
            }
        }
        return flag;
    }

    private boolean withAllChinese(String content){
        /*
        判断全部中文字相关的UNICODE编码区
         */
        boolean flag = true;
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(c);
            if (unicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
            || unicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            || unicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
            || unicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
            || unicodeBlock == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
            || unicodeBlock == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
            || unicodeBlock == Character.UnicodeBlock.GENERAL_PUNCTUATION){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        CJKFrame cjkFrame = new CJKFrame();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(cjkFrame.withChinese0(next));
        System.out.println(cjkFrame.withChinese1(next));
        System.out.println(cjkFrame.withChinese2(next));
        System.out.println(cjkFrame.withAllChinese(next));
    }
}
