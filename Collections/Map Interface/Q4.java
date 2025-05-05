import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) {
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("A",4);
        map2.put("B",5);
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",10);
        map1.put("C",60);
        map1.put("D",40);
        map1.put("E",50);

        map1.forEach((key,val)-> {
            if(map2.containsKey(key)){
//                System.out.println(map2.get(key)+ " " + val + " " + key);
                map2.put(key, (val + map2.get(key)));

            }else {
                map2.put(key,val);
            }
        });
        System.out.println(map2);
    }
}
