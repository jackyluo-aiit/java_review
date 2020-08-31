package src.ThreadDemo;

public class MyThread1 implements Runnable{
    private String name;
    public MyThread1(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+"Downloaded"+i+"%");
        }
    }
}
