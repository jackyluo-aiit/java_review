package ThreadDemo.Join;

import ThreadDemo.Priority.MyThread;

public class JoinDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("JACKY");
        MyThread myThread1 = new MyThread("JESSICA");
        MyThread myThread2  = new MyThread("Andrew");

        myThread.start();
        //会预先执行完，且代码放置顺序有要求
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread1.start();
        myThread2.start();
    }

}
