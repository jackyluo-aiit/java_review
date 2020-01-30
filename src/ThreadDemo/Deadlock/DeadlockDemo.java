package ThreadDemo.Deadlock;

public class DeadlockDemo {
    public static void main(String[] args) {
        DeadlockThread deadlockThread = new DeadlockThread();
        deadlockThread.flag = 1;

        DeadlockThread deadlockThread1 = new DeadlockThread();
        deadlockThread.start();
        deadlockThread1.start();
    }
}
