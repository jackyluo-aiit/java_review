package Reg;

import java.util.regex.Pattern;

public class RegDemo {
    public static void main(String[] args) {
        String var1 = "var__12_deg";
        String var2 = "12_var_test";
        String pattern = "_*[a-zA-Z]+_*.*?";
        boolean matches = Pattern.matches(pattern, var1);
        boolean matches1 = Pattern.matches(pattern, var2);
        System.out.println(matches);
        System.out.println(matches1);
    }


}
