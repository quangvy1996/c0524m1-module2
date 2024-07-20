package ss11.bai_tap.tree_map;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class KhoiTaoTreeMap {
    public static void main(String[] args) {
        String string = "HelloWorld";
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < string.length(); i++) {
            list.add(String.valueOf(string.toLowerCase().charAt(i)));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (treeMap.containsKey(list.get(i))) {
                treeMap.put(list.get(i), treeMap.get(list.get(i)) + 1);
            }
            else {treeMap.put(list.get(i), 1);}
        }
        System.out.println("Contents of TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
