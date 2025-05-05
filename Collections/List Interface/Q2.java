import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("apple");

        Map<String, Integer> map = new HashMap<>();

        for(String i : list){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i,1);
            }
        }

        for(Map.Entry<String,Integer> i : map.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }

    }
}
