package Utils;

import StringBufferDemo.Person;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = new int[]{2,31,4,6};
        System.out.println(Arrays.toString(arr));

        Person[] ps = new Person[]{
                new Person("Jacky", 22, 001),
                new Person("Jessica", 23, 002)};
        System.out.println(Arrays.toString(ps));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int i = Arrays.binarySearch(arr1, 2);
        System.out.println(i);

        //基本类型的数组不能转换为集合，需要包装类
        Integer[] arr2 = {1,2,3,4};
        List<Integer> ints = Arrays.asList(arr2);
        //转换后的集合不能改变长度
    }
}
