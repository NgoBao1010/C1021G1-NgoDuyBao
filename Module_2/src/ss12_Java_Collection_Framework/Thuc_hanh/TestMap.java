package ss12_Java_Collection_Framework.Thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Thựn",18);
        hashMap.put("Ling",29);
        hashMap.put("Hếu",24);
        hashMap.put("Dợt",18);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap);

        Map<String,Integer> linkedhashmap = new LinkedHashMap<>(16,0.75f,true);
        linkedhashmap.put("Khoa",18);
        linkedhashmap.put("Lạc",35);
        linkedhashmap.put("Long",26);
        linkedhashmap.put("Phú",26);
        System.out.println("\n" + linkedhashmap );
        System.out.println("The age for Long is " + linkedhashmap.get("Long"));
    }
}
