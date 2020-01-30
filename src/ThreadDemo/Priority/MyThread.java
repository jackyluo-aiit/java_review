package ThreadDemo.Priority;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    /*
    这是线程的逻辑体
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+" Downloaded"+i+"%");
        }
    }
}
