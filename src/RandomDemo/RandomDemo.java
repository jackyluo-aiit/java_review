package RandomDemo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        //在int的范围内随机获取一个数
        int i = r.nextInt();
        System.out.println(i);
        //获取一组数
        for (int j = 0; j < 10; j++) {
            int i1 = r.nextInt();
            System.out.println(i1);
        }
        //指定范围随机数0-9
        int i1 = r.nextInt(10);
        System.out.println(i1);

        //获取固定的随机数, 种子可取任何数，每一个种子都产生固定的一组数
        Random random = new Random(98);
        for (int j = 0; j < 10; j++) {
            int i2 = random.nextInt(10);
            System.out.println(i2);
        }


    }
}
