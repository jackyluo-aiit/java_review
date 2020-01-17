package ArrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
        list.set(2,"null");
        System.out.println(list);


    }
}
