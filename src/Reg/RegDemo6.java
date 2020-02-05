package Reg;

public class RegDemo6 {
    public static void main(String[] args) {
        String s = "windowsNT windowsXP windows7 windows8";
        String r = s.replaceAll("windows(?=NT|XP)","*");
        System.out.println(r);

        String r1 = s.replaceAll("windows(?=\\d)", "*");
        System.out.println(r1);

        String r2 = s.replaceAll("window(?!=\\d)", "*"); //必须不是数字
        System.out.println(r2);

        String s1 = "AwindowsNT BwindowsXP Cwindows7 Dwindows8";
        String r3 = s1.replaceAll("(?<=[A-Z])windows", "*"); //判断字符串前面
        System.out.println(r3);
    }
}
