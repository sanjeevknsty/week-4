import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q5 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList( 4, 1, 2, 3,5,6));
        System.out.println(set2.containsAll(set1));
    }
}
