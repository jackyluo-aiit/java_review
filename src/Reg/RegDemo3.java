package Reg;

public class RegDemo3 {
    public static void main(String[] args) {
        String s = "123a234567b";
        String r1 = s.replaceAll("\\d{2,3}", "*");//{}表示出现次数,{2,3}最少出现2次，最多出现3次，在同时符合的时候匹配最多的字符
        System.out.println(r1);

        String r2 = s.replaceAll("\\d?", "*");
        System.out.println(r2);

        String r3 = s.replaceAll("\\d*", "*");
        System.out.println(r3);

        String r4 = s.replaceAll("\\d+", "*");
        System.out.println(r4);

        String s1 = "ababbbc";
        String r5 = s1.replaceAll("(ab)+", "*");
        System.out.println(r5);

        String s2 = "Tom and Jack are my friends, but Peter is not";
        String r6 = s2.replaceAll("Tom|Jack", "*");
        System.out.println(r6);
    }
}
