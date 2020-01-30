package ThreadDemo.Protect;

public class ProtectDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("JACKY");
        //设置守护线程, 主线程结束，此线程也会结束
        myThread.setDaemon(true);
        myThread.start();
        System.out.println("main thread end");
    }
}
