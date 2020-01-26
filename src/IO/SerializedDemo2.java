package IO;

import StringBufferDemo.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class SerializedDemo2 {

    public static void main(String[] args) {
        Person p = new Person("Jacky",22,001);
        //持久性储存对象
        ObjectInputStream o = null;
        try {
            o = new ObjectInputStream(new FileInputStream("Person.txt"));
            //反序列化
            List<Person> o1 = (List<Person>) o.readObject();
            System.out.println(o1);
        } catch (Exception e) {
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
