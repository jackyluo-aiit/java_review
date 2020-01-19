package DynamicParam;

public class Demo {
    public static void main(String[] args) {
        int add = add(10);
        System.out.println(add);
        int add1 = add(10, 20, 30);
        System.out.println(add1);
        int add2 = add(10, 20, 30, 40);
        System.out.println(add2);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    //dynamic
    //可以代表数组或者单个变量的传递，在方法里会先组装成数组
    //如果调用时，发现有正好能匹配的方法，就不调用可变参数的方法
    public static int add(int... a){
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }
}
