import java.util.*;

class Policy implements Comparable<Policy> {
    String policyNumber;
    String policyholderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        Policy p1 = (Policy) obj;
        return Objects.equals(policyNumber, p1.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy" +"\n"+
                "policyNumber : '" + policyNumber +"\n" +
                "policyholderName : '" + policyholderName + "\n" +
                "expiryDate : " + expiryDate +"\n" +
                "coverageType : "+ coverageType + "\n" +
                "premiumAmount : " + premiumAmount +"\n" + "\n"
                ;
    }
}

public class Q1 {
    public  HashSet<Policy> hash = new HashSet<>();
    public  LinkedHashSet<Policy> linkHash = new LinkedHashSet<>();
    public  TreeSet<Policy> tree = new TreeSet<>();

    public  void insert(Policy policy){
        System.out.println(policy.policyNumber );
        long startTime = System.nanoTime();
       hash.add(policy);
       long endTime = System.nanoTime();
        System.out.println("HashSet  " + (endTime-startTime));
        startTime = System.nanoTime();

       linkHash.add(policy);
        endTime = System.nanoTime();
        System.out.println("LinkHash  " + (endTime-startTime));

        startTime = System.nanoTime();
       tree.add(policy);
        endTime = System.nanoTime();
        System.out.println("Tree Set  " + (endTime-startTime));


    }
    public void display() {
        System.out.println("HashSet  " + hash);
        System.out.println("LinkedHashSet  " + linkHash);
        System.out.println("TreeSet  " + tree);
    }
    public static void main(String[] args) {
        Q1 manager = new Q1();
        manager.insert(new Policy("P101", "Alice", new Date("16/05/2024"), "Health", 1200.0)); // Jan 1, 2024
        manager.insert(new Policy("P102", "Bob", new Date("16/06/2023"), "Auto", 900.0)); // Apr 27, 2024
        manager.insert(new Policy("P102", "Bob", new Date("16/06/2023"), "Auto", 900.0)); // Apr 27, 2024
        manager.insert(new Policy("P103", "Charlie", new Date("16/03/2025"), "Home", 1500.0)); // Sept 1, 2023
        manager.display();
    }
}
