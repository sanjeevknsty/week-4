
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

class Bank{
    private int balance = 1000;
    public void withdraw(int amount) throws InsufficientBalanceException,IllegalArgumentException {
        if(amount < 0){
            throw  new IllegalArgumentException( "Invalid amount!") ;
        }
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        System.out.println("Withdrawal successful,  balance: " + (balance-amount));
    }
}
public class Q10 {
    public static void main(String[] args) {
        try{
            Bank b = new Bank();
            b.withdraw(-1000);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
