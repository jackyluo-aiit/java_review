package Sort;

import CollectionEntityDemo.Student;

import java.util.TreeSet;

public class SortDemo {
    public static void main(String[] args) {
        String s1 = "ac";
        String s2 = "acb";
        //String comparision: positive means s1 larger
        System.out.println(s1.compareTo(s2));

        Student abc = new Student("abc", 22, 100, 91);
        Student abb = new Student("abb", 23, 111, 91);
        System.out.println(abc.compareTo(abb));

        TreeSet<Student> students = new TreeSet<>();
        students.add(abc);
        students.add(abb);
        //从小到大排序
        System.out.println(students);


    }
}
