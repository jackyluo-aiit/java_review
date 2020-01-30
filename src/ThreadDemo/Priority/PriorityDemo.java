package ThreadDemo.Priority;

public class PriorityDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("JACKY");
        MyThread myThread1 = new MyThread("JESSICA");
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();
        myThread1.start();
    }
}
