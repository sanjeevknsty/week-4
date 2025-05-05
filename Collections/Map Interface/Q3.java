import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
        Map<String,Integer> si = new HashMap<>();
        si.put("A",10);
        si.put("B",20);
        si.put("C",60);
        si.put("D",40);
        si.put("E",50);

        System.out.println(Collections.max(si.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey());
        int maxi = si.get("A");
        String st = "";
        for(Map.Entry<String,Integer> i : si.entrySet()){
            maxi = Math.max(maxi,i.getValue());
            if(maxi == i.getValue()){
                st = i.getKey();
            }
        }
        System.out.println(st);
    }
}
