package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = {3,5,6,2,1,4,2,1,2,2,3,3,1,1};
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            boolean add = list.add(arr[i]);
            System.out.println(add);
        }
        int count = 0;
//        list.add(null);
//        list.add(null);
//        list.add(null);
        for(int i = 0; i < list.size()-1;i++){
            int num = list.get(i);
            int next = list.get(i+1);
            if(num == next){
                list.remove(i+1);
                list.remove(i);
                count++;
                System.out.println(list);
                i = -1;
            }
        }
        if(count%2!=0){
            System.out.println("Alice"+count);
        }
        else System.out.println("Bob"+count);
        System.out.println(list);
//        list.set(2,"null");

    }
}
