import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q4 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(3,4,2,7,5));
        set1.stream().sorted();
        System.out.println(set1);
    }
}
