package ThreadDemo;

public class threadDemo{
    public static void main(String[] args) {
        //创建线程对象
//        MyThread myThread = new MyThread("super");
//        myThread.start();//启动
//        System.out.println("method end");
        //第二种方法
        Thread thread = new Thread(new MyThread1("JACKY"));
        Thread thread1 = new Thread(new MyThread1("JESSICA"));
        thread.start();
        thread1.start();
    }
}
