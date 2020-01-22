package MapDemo;

import CollectionEntityDemo.Student;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, String> treeMap =  new TreeMap<>();
        treeMap.put("b","白胜");
        treeMap.put("a","林冲");
        treeMap.put("c", "公孙胜");
        //按照字符顺序排序
        System.out.println(treeMap);

        Map<Student, String> studentMap = new TreeMap<>();
        studentMap.put(new Student("jacky",22,001,100),"a");
        studentMap.put(new Student("jessica",22,001,99),"b");
        studentMap.put(new Student("andrew",22,001,90),"c");
        System.out.println(studentMap);



    }
}
