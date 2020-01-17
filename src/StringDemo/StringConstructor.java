package StringDemo;

public class StringConstructor {
    public static void main(String[] args) {
        //1.
        String s = new String();
        byte[] bs = {97,98,99,100};
        //2.
        String s2 = new String(bs);
        System.out.println(s2);
        //3.
        //取offset=1为开始点，长度为2的数据：98，99（b,c）
        String s3 = new String(bs, 1, 2);
        System.out.println(s3);
        //4.
        char[] cs = {'b','c','h','g','a'};
        String s4 = new String(cs);
        System.out.println(s4);
        //5.
        String s5 = new String("hello");
        System.out.println(s5);

        //question
        String s6 = new String("abc");
        String s7 = "abc";

    }


}
