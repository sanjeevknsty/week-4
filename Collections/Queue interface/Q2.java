import java.util.LinkedList;
import java.util.Queue;

public class Q2 {
    public static void main(String[] args) {
        int N = 5;
        Queue<String> que = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            String str = Integer.toBinaryString(i);
            que.add(str);
        }
        System.out.println(que);
    }
}
