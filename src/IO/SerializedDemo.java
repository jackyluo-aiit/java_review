package IO;

import StringBufferDemo.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializedDemo {

    public static void main(String[] args) {
        Person p = new Person("Jacky",22,001);
        Person p1 = new Person("Jacky",21,001);
        Person p2 = new Person("Jacky",20,001);
        List<Person> people = new ArrayList<>();
        people.add(p);
        people.add(p1);
        people.add(p2);
        //持久性储存对象
        ObjectOutputStream o = null;
        try {
            o = new ObjectOutputStream(new FileOutputStream("Person.txt"));
            o.writeObject(people);
            o.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(o!=null){
                try {
                    o.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
