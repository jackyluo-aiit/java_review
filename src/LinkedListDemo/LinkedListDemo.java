package LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Jacky");
        linkedList.add("Jessica");
        linkedList.add("Stark");
        //add first
        linkedList.addFirst("Luo");
        //add last
        linkedList.addLast("CU");
        //把队列看做一个stack, 从头开始出栈，压栈也是从头压入
        Object pop = linkedList.pop();
        System.out.println("Out from stack:"+pop);
        System.out.println(linkedList);
        linkedList.push("Luo");
        System.out.println(linkedList);
    }
}
