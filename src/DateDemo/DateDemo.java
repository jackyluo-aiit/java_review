package DateDemo;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d  = new Date();
        System.out.println(d);

        //current date and time
        long l = System.currentTimeMillis();
        Date d1 = new Date(l);
        System.out.println(d1);

        //previous date
        System.out.println(new Date(l-24*60*60*1000));

        //current timeMills()
        long time = d1.getTime();
        System.out.println(time);
    }
}

