import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q1 {

    public static <T> void reverseList(List<T> list){
        int i = 0;
        int j = list.size() -1;
        while (i < j){
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        reverseList(arr);

        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(10);
        linkList.add(20);
        linkList.add(30);
        linkList.add(40);
        reverseList(linkList);
    }
}
