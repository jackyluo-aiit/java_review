package CollectionEntityDemo;

import StringBufferDemo.Person;

import java.util.ArrayList;
import java.util.List;

public class Entity {
    public static void main(String[] args) {
        //define a collection that only storages one type
        List<Person> strings = new ArrayList<Person>();
        strings.add(new Person("Jacky", 22, 01));
        strings.add(new Person("Jessica", 23, 02));

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Andrew", 22, 03, 100));
        students.add(new Student("Jason", 23, 04, 100));

        strings.addAll(students);
        System.out.println(strings);
    }

}
