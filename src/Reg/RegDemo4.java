package Reg;

public class RegDemo4 {
    public static void main(String[] args) {
        String s = "dxxxdxxxd";
        String r1 = s.replaceAll("d.+d", "*");//为了整体匹配成功，贪婪模式也会让步
        System.out.println(r1);

        String r2 = s.replaceAll("d.+?", "*");//非贪婪模式，即尽可能少的匹配，此处，'.+'表示1或者多个，所以就只匹配一个就会停止
        System.out.println(r2);

        String r3 = s.replaceAll("d.+?d", "*");//非贪婪模式，即尽可能少的匹配
        System.out.println(r3);

        String s1 = "鲁迅与藤野严九郎（注：鲁迅在日本留学期间的老师）的朝夕相处，对其走上文坛产生过重要影响。藤野毕业于爱知县立医学校（注：今名古屋大学），在鲁迅入学前的两个月他才升格为教授。";
        String r4 = s1.replaceAll("(（注：.+?）)+", "");
        //第一个.+?表示"注：后面的字符，因为是非贪婪模式，所以尽可能少的匹配字符，所以到第一个'）'停下匹配;
        //第二个.+?表示将整个（注：）作为组的时候的匹配也是非贪婪模式，尽可能少地匹配到整个组。
        System.out.println(r4);
    }
}
