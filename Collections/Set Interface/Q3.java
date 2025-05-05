import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,5,4));
        Set<Integer> set3 = new HashSet<>(set1);
        Set<Integer> set4 = new HashSet<>(set1);
        set3.addAll(set2);
        set4.retainAll(set2);

        set3.removeAll(set4);
        System.out.println(set3);
    }
}
