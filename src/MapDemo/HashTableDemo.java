package MapDemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map<String, String> stringStringHashtable = new Hashtable<>();
        stringStringHashtable.put("kkk","kkk");
        stringStringHashtable.put("lll","lll");
        stringStringHashtable.put("ooo","ooo");
        stringStringHashtable.put("kkk",null);
        System.out.println(stringStringHashtable);
    }
}
