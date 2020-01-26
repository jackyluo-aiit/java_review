package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("audi");
        coll.add("honda");
        coll.add("toyota");
        System.out.println(coll);
        //把一个集合的内容加入到另一集合中
        Collection coll1 = new ArrayList();
        coll1.add("BMW");
        coll1.add("Benz");
        coll.addAll(coll1);
        System.out.println(coll);
        //删除
        coll1.clear();
        System.out.println(coll1);
        //删除某一个
        coll.remove("audi");
        System.out.println(coll);
        //批量删除
        coll.removeAll(coll1);
        System.out.println(coll);
        //是否存在某个集合中所有元素
        coll1.add("toyota");
        System.out.println(coll.containsAll(coll1));
        //whether it is null
        System.out.println(coll.isEmpty());
        //transfer to Array
        Object[] objects = coll.toArray();
        System.out.println(Arrays.toString(objects));
        int[] arr = {1,2,3};
        int[] arr1 = {2,4};
        Integer[] ints = new Integer[arr.length];
        for(int i= 0; i<=arr.length-1; i++){
            ints[i] = Integer.valueOf(arr[i]);
        }
        List<Integer> newInts = Arrays.asList(ints);
        System.out.println(newInts);
        newInts.remove(2);
        ints = (Integer[]) newInts.toArray();
        System.out.println(ints);
    }
}
