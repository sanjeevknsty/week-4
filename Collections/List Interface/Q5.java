import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q5 {
    public static void findLast(LinkedList<String> list,int key){
        ListIterator<String> temp = list.listIterator();
        int count  =0 ;
        while(temp.hasNext()){
            count++;
            temp.next();
        }
        temp = list.listIterator();
        int currCount = 0;
        while (temp.hasNext() && (count-key) != currCount){
            currCount++;
                temp.next();
        }
        System.out.println(list.get(currCount));

    }
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("A");
        linkList.add("B");
        linkList.add("C");
        linkList.add("D");

        findLast(linkList,3);
    }
}
