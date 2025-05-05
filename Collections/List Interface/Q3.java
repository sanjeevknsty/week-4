import java.util.ArrayList;
import java.util.List;

public class Q3 {
    // 10 20 30 40 50
    // 40 50 10 20 30
    public static void rotate(List<Integer> arr,int step){
//        3 + 2 = 5;
//        4 + 2 > 5 ;  4+2 - 5 = 1;
        for(int i = 0  ; i < step ; i++){
            int temp = arr.get(arr.size()-1);
            for(int j = arr.size() - 1 ; j > 0 ; j--){
                arr.set(j, arr.get(j - 1));
            }
            arr.set(0, temp);
            System.out.println(arr);
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        rotate(list,8);
    }
}
