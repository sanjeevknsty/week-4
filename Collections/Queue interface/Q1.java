import java.util.LinkedList;
import java.util.Queue;

public class Q1 {
    public static void reverse(Queue<Integer> que){
        if (que.isEmpty())
            return;
        int temp = que.poll();
        reverse(que);
        que.add(temp);

    }

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
//        1,2,3,4,5
        reverse(que);
        System.out.println(que);
    }
}
