package Collection;

import StringBufferDemo.Person;

public class ArrayDemo {
    /*
    数组局限性：长度固定
     */
    public static void main(String[] args) {
        Person[] person = new Person[10];
        for (int i = 0; i < 10; i++) {
            Person jacky = new Person("Jacky", 22, 1);
            person[i] = jacky;
        }
        for (int i = 0; i<person.length;i++) {
            System.out.println("i:"+i+person[i]);
        }
    }
}
