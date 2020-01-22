package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("白日鼠","白胜");
        map.put("豹子头","林冲");
        map.put("豹子头","林虫儿");
        //如果存在重复的Key, 就会把之前的值覆盖
        map.put(null, "bbb");
        //允许有个键为空
        System.out.println(map);
    }
}
