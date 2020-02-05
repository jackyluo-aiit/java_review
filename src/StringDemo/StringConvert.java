package StringDemo;

public class StringConvert {
    public static void main(String[] args) {
        String s = "11";
        //String to any other types
        int i = Integer.parseInt(s);
        char c = s.charAt(0);
        float f = Float.valueOf(s);
        double d = Double.valueOf(s);
        System.out.println(i);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);

        //any types to String
        char c1 = 'c';
        int i1 = 11;
        double d1 = 11.0;
        float f1 = 11.0f;
        String s1 = String.valueOf(i1);
        String s4 = String.valueOf(d1);
        String s2 = String.valueOf(f1);
        String s3 = String.valueOf(c1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
