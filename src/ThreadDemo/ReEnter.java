package ThreadDemo;

public class ReEnter {
    public static void main(String[] args) {
        GetAndSet getAndSet = new GetAndSet();
        new Thread(()->{
            getAndSet.get(Thread.currentThread());
        }).start();

        new Thread(()->{
            getAndSet.get(Thread.currentThread());
        }).start();
    }
}

class GetAndSet{
    public synchronized void get(Thread thread){
        System.out.println(thread.getName() + " is getting;");
        set(thread);
    }

    public synchronized void set(Thread thread) {
        System.out.println(thread.getName() + " is setting;");
    }
}
