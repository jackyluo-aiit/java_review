package StringDemo;

import java.util.Scanner;

public class StringAPIExercise2 {
    /*
    获取一段字符串并把第一个变成大写，其余变小写
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        if(s1!=null&&!s1.isEmpty()){
            String substring1 = s1.substring(0, 1).toUpperCase();
            String substring = s1.substring(1).toLowerCase();
            String result = substring1+substring;
            System.out.println(result);
        }
    }
}
