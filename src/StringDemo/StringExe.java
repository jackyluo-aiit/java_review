package StringDemo;

public class StringExe {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello2";
        String c = a + 2;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(c.intern());

        StringExe stringExe = new StringExe();
        System.out.println(stringExe.validTime("24:00"));
    }

    boolean validTime(String time) {
        String[] times = time.split(":");
        String timeS = times[0];
        String second = times[1];
        int i = Integer.parseInt(timeS);
        int i1 = Integer.parseInt(second);
        System.out.println(i);
        System.out.println(i1);
        if(Integer.parseInt(timeS)>24 || Integer.parseInt(timeS)<0){
            return false;
        }
        else if(Integer.parseInt(second)>60 || Integer.parseInt(second)<0){
            return false;
        }
        return true;
    }
}

