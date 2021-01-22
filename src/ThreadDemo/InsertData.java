package ThreadDemo;

public class InsertData {
    public static void main(String[] args) {
        final Insertion insertion = new Insertion();
        new Thread(()->{
            insertion.insert2(Thread.currentThread());
        }).start();
        new Thread(()->{
            insertion.insert2(Thread.currentThread());
        }).start();
    }

}

class Insertion{
    //共享，可变的资源
    private final int[] data= {1,2,3,4,5};

    //访问共享，可变的资源
    public synchronized void insert(Thread thread){
        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName() + " is running: " + data[i]);
        }
    }

    public void insert2(Thread thread) {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(thread.getName() + " is running: " + data[i]);
            }
        }
    }
}
