package SystemDemo;

import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("hhhh");
        Scanner s = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {2, 3, 6, 7, 8};
        //array copy
        System.arraycopy(arr, 2, arr1, 0, 2);
        System.out.println(Arrays.toString(arr1));

        //获取系统配置变量信息
        Properties properties = System.getProperties();
//        System.out.println(properties);
        Set<Object> objects = System.getProperties().keySet();
        for(Object o: objects){
            System.out.println((String)o+"---->"+System.getProperty((String)o));
        }
        //Java虚拟机退出，参数为退出代码
        System.exit(1);

        //获取系统时间毫秒为单位
        long start = System.currentTimeMillis();
        method();
        long l = System.currentTimeMillis();
        System.out.println(l-start);


    }

    public static void method() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Running");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
