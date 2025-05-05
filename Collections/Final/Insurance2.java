import java.util.*;

class Policies implements Comparable<Policies>{
    Integer policyNumber;
    String policyholderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public Policies(Integer policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }


    @Override
    public int compareTo(Policies p) {
        return this.expiryDate.compareTo(p.expiryDate);
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



public class Insurance2 {
    public HashMap<Integer,Policies> hash = new HashMap();
    public LinkedHashMap<Integer,Policies> linkHash = new LinkedHashMap();
    public TreeMap<Integer,Policies> tree = new TreeMap();

    public void insert(Policies policy){

        hash.put(policy.policyNumber,policy);
        linkHash.put(policy.policyNumber,policy);
        tree.put(policy.policyNumber,policy);

    }
    public void displayPolicies() {
        System.out.println("HashMap Policies : " + hash.values());
        System.out.println("LinkedHashMap Policies : " + linkHash.values());
        System.out.println("TreeMap Policies : " + tree.values());
    }

    public void showPolicy(Integer policyNumber){
        if(hash.containsKey(policyNumber)){
            System.out.println(hash.get(policyNumber));

        }
    }
    public void showPolicyByHolder(String policyholderName){
       for(Map.Entry<Integer,Policies> entry : hash.entrySet()){
           if(entry.getValue().policyholderName.equalsIgnoreCase(policyholderName)){
               System.out.println(entry.getValue());
           }
       }
    }

    public static void main(String[] args) {
        Insurance2 ins = new Insurance2();
        ins.insert(new Policies(101, "Alice", new Date("16/05/2024"), "Health", 1200.0));
        ins.insert(new Policies(102, "Bob", new Date("16/06/2023"), "Auto", 900.0));
        ins.insert(new Policies(103, "Charlie", new Date("16/03/2025"), "Home", 1500.0));


        ins.showPolicy(101);
        ins.showPolicyByHolder("alice");
//        ins.displayPolicies();
    }
}