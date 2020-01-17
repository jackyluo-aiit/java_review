package ListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListAPI {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jacky");
        list.add("jessica");

        System.out.println(list);
        //添加后所有元素向后移一位
        list.add(0, "Logan");
        System.out.println(list);
        //将另一个List 加入
        List list1 = new ArrayList();
        list1.add("Stark");
        list1.add("tony");
        list.addAll(list1);
        System.out.println(list);
        //获取
        Object o = list.get(0);
        System.out.println(o);
        //集合的长度
        int size = list.size();
        System.out.println(size);
        //遍历
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
            String next = (String) iterator.next();
            if("jessica".equals(next)){
                //遍历过程中添加元素，但不在本次遍历的时候不生效，遍历后才添加。
                iterator.add("Wanda1");
            }
            System.out.println(next);
        }
        //反向遍历
        while(iterator.hasPrevious()){
            String previous = (String) iterator.previous();
            System.out.println(previous);
        }
        System.out.println("seperator-----------------");
        int size1 = list.size();
        for (int i = 0; i < list.size(); i++) {
            String o1 = (String) list.get(i);
            if("jessica".equals(o1)){
                list.add("Wanda2");
            }
            System.out.println(o1);
        }
    }
}
