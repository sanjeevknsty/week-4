import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Q4 {
    public  static void duplicate(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for(Integer i : list){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        System.out.println(newList);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        duplicate(list);
    }
}
