import java.util.Set;

public class Q1 {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2 = Set.of(3,5,4,1,2);
        System.out.println(set1.equals(set2));
    }
}
