import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        Map<Character,Integer> KV = new HashMap<>();
        Map <Integer, List<Character>> invert = new HashMap<>();
        KV.put('A',1);
        KV.put('B',2);
        KV.put('C',1);
        KV.put('D',2);
        KV.put('E',3);


        for(Map.Entry<Character,Integer> i : KV.entrySet()){
            if(!invert.containsKey(i.getValue())){
                invert.put(i.getValue(), new ArrayList<>(List.of(i.getKey())) );
            }else {
                invert.get(i.getValue()).add(i.getKey());

            }
        }
        System.out.println(invert);
    }
}
