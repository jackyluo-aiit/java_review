package ThreadDemo;

public class DirtyRead {
    public String username = "user";
    public String password = "password";

    //同步实例方法
    public synchronized void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;

            System.out.println("method=setValue " +"\t" + "threadName="
                    + Thread.currentThread().getName() + "\t" + "username="
                    + username + ", password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //非同步实例方法
    public void getValue() {
        System.out.println("method=getValue " + "\t" +  "threadName="
                + Thread.currentThread().getName()+ "\t" + " username=" + username
                + ", password=" + password);
    }
}


//线程类
class ThreadA extends Thread {

    private DirtyRead dirtyRead;

    public ThreadA(DirtyRead dirtyRead) {
        super();
        this.dirtyRead = dirtyRead;
    }

    @Override
    public void run() {
        super.run();
        dirtyRead.setValue("User", "Wrong Password");
    }
}


//测试类
class Test {

    public static void main(String[] args) {
        try {
            //临界资源
            DirtyRead dirtyReadRef = new DirtyRead();

            //创建并启动线程
            ThreadA thread = new ThreadA(dirtyReadRef);
            thread.start();

            Thread.sleep(200);// 打印结果受此值大小影响

            //在主线程中调用
            dirtyReadRef.getValue();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
