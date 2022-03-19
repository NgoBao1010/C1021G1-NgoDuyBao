package ss12_Java_Collection_Framework.Bai_tap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str = scanner.nextLine();
        Character charac;

        Map<Character,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length();i++){
            charac = str.charAt(i);

            if (treeMap.containsKey(charac)){
                int count = treeMap.get(charac);
                treeMap.put(charac,count + 1);
            }else {
                treeMap.put(charac,1);
            }
        }
        System.out.println(treeMap);
    }
}
