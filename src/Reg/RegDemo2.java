package Reg;

public class RegDemo2 {
    public static void main(String[] args) {
        String s = "a..[a]..aaaabb";
        String r = s.replaceAll("\\.\\.\\[a\\]\\.\\.a","*");
        System.out.println(r);

        String r1 = s.replaceAll("\\Q..[a]..a\\E","*"); //创建特殊字符失效区
        System.out.println(r1);
    }
}
