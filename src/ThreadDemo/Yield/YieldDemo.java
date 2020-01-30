package ThreadDemo.Yield;

import ThreadDemo.Priority.MyThread;

public class YieldDemo {
    public static void main(String[] args) {
        ThreadDemo.Priority.MyThread myThread = new MyThread("JACKY");
        ThreadDemo.Priority.MyThread myThread1 = new MyThread("JESSICA");
        ThreadDemo.Priority.MyThread myThread2  = new MyThread("Andrew");

        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}
