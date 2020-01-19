package SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();
        //add elements
        /*
        不可重复，重复自动去重；
        无序
         */
        objects.add("关羽");
        objects.add("张飞");
        objects.add("刘备");
        objects.add("刘备");
        objects.add(null);
        System.out.println(objects);

        //去重规则探究
        HashSet<Person> persons = new HashSet<Person>();
        persons.add(new Person("孔明", 26));
        persons.add(new Person("张飞", 25));
        persons.add(new Person("张飞", 25));
        System.out.println(persons);

        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("关羽");
        strings.add("张飞");
        strings.add("刘备");
        strings.add("赵子龙");
        System.out.println(strings);

    }
}
