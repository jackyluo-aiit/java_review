package Utils;

import CollectionEntityDemo.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Student> objects = new ArrayList<>();
        objects.add(new Student("jacky",22,100,100));
        objects.add(new Student("Jessica", 23, 001, 4));
        objects.add(new Student("Andrew",23,003, 22));

        //集合翻转
        Collections.reverse(objects);
        System.out.println(objects);

        //打乱集合
        Collections.shuffle(objects);
        System.out.println(objects);

        //排序: compareTo or comparator
        // (Entity does not need to implements Comparable)
        Collections.sort(objects);
        System.out.println(objects);

        //Collection 中只有vector是线程安全的
        //可以通过调用方法实现线程安全
        List<Student> students = Collections.synchronizedList(objects);
    }
}
