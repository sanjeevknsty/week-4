import java.util.*;

public class Voting {
    private Map<String, Integer> map;
    private TreeMap<String, Integer> treeMap;
    private LinkedHashMap<String, Integer> linkedHash;

    public Voting() {
        map = new HashMap<>();
        treeMap = new TreeMap<>(Comparator.comparingInt(map::get).reversed());
        linkedHash = new LinkedHashMap<>();
    }

    public void cast(String candidate) {
        map.put(candidate, map.getOrDefault(candidate, 0) + 1);
        linkedHash.put(candidate, map.get(candidate));
        System.out.println("first  " + treeMap);
        treeMap.clear();
        System.out.println("Clear  " + treeMap);
        treeMap.putAll(map);
        System.out.println("Insert Map  " + treeMap);
    }



    public void displayResults() {
        System.out.println(map);
        System.out.println("Sorted :");
        treeMap.forEach((candidate, votes) ->
                System.out.println(candidate + ": " + votes));
        System.out.println();
        System.out.println("Vote Order:");
        linkedHash.forEach((candidate, votes) ->
                System.out.println(candidate + ": " + votes));
    }

    public static void main(String[] args) {
        Voting votingSystem = new Voting();

        votingSystem.cast("Ram");
        votingSystem.cast("Mohan");
        votingSystem.cast("Ram");
        votingSystem.cast("Raju");
        votingSystem.cast("Mohan");

        votingSystem.displayResults();
    }
}
