import java.util.*;

class Customer {
    String accountNumber;
    double balance;

    public Customer(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber + " Balance " + balance;
    }
}

public class Bank {
    private Map<String, Double> map = new HashMap<>();
    private TreeMap<Double, List<String>> treeMap = new TreeMap<>();
    private Queue<String> queue = new LinkedList<>();
    public void addCustomer(String accountNumber, double balance) {
        map.put(accountNumber, balance);
        treeMap.putIfAbsent(balance, new ArrayList<>());
        treeMap.get(balance).add(accountNumber);
    }



    public void WithdrawAmount(String accountNum, double amount) {
        queue.add(accountNum);
        while (!queue.isEmpty()) {
            String accountNumber = queue.poll();
            double currentBalance = map.get(accountNumber);
            if (currentBalance >= amount) {
                map.put(accountNumber, currentBalance - amount);
                System.out.println("withdraw : " + accountNumber + "  Balance " + map.get(accountNumber));
            } else {
                System.out.println("Insufficient : " + accountNumber + "  Balance " + currentBalance);
            }
        }
        System.out.println();

    }

    public void showSortedByBalance() {
        System.out.println();
        System.out.println("sort by balance:");
        for (Map.Entry<Double, List<String>> entry : treeMap.entrySet()) {
            for (String accountNumber : entry.getValue()) {
                System.out.println("AccountNumber: " + accountNumber + " Balance: " + entry.getKey());
            }
        }
    }

    public void showAllAccounts() {
        System.out.println("\nAll customer :");
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  Balance " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("1001", 500.0);
        bank.addCustomer("1002", 300.0);
        bank.addCustomer("1003", 1000.0);
        bank.addCustomer("1004", 700.0);

        bank.showAllAccounts();
        bank.showSortedByBalance();

        bank.WithdrawAmount("1002", 200);
        bank.WithdrawAmount("1001", 600);
        bank.WithdrawAmount("1003", 500);
    }
}
