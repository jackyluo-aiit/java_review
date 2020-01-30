package ThreadDemo.SleepDemo;

import java.util.Date;

public class sleepDemo {
    public static void main(String[] args) {
        while (true){
            System.out.println(new Date());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class MyThread implements Runnable{
    static Object object = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object){
                try {

                    //这个休眠如果在sychronized里面的话，就不会让出CPU资源
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}