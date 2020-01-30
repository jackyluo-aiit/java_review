package MapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAPI {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("白日鼠", "白胜");
        map.put("豹子头", "林冲");
        map.put("豹子头", "林虫儿");
        System.out.println(map.size());
        Map<String, String> objectObjectHashMap = new HashMap<>();
        //复制另外一个Map
        objectObjectHashMap.putAll(map);
        System.out.println(objectObjectHashMap);
        //delete
        map.remove("白日鼠");
        //get value
        String s = map.get("豹子头");
        System.out.println(s);
        //get a set of keys
        Set<String> strings = map.keySet();
        System.out.println(strings);
        //iteration
        for (String key : strings) {
            System.out.println(map.get(key));
        }
        //contains
        System.out.println(map.containsKey("白日鼠"));
        System.out.println(map.containsValue("白胜"));
        System.out.println(map.isEmpty());
        //iteration
        map.put("llll", "jjkkjk");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //get a set of entry in the map
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //change to
        Map<String, String> stringStringMap = Collections.synchronizedMap(map);
    }
}
