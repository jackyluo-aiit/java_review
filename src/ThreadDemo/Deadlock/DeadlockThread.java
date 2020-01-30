package ThreadDemo.Deadlock;

public class DeadlockThread extends Thread{
    int flag;


    @Override
    public void run() {
        if (flag == 1) {
            synchronized (Lock.lock1){
                System.out.println("Enter lock1");
                try {
                    Lock.lock1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Lock.lock2){
                    System.out.println("Enter lock2 in lock1");
                    Lock.lock2.notify();
                }
            }
        } else {
            synchronized (Lock.lock2){
                System.out.println("Enter lock2");
//                try {
//                    Lock.lock2.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (Lock.lock1){
                    System.out.println("Enter lock1 in lock2");
                    Lock.lock1.notify();
                }
            }
            System.out.println("end.");
        }
    }
}
