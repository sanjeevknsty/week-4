public class Q6 {
    public static double  calculateInterrest (double amount, double rate, int years) throws IllegalArgumentException {
        if(amount <= 0 || rate <= 0 || years <= 0){

            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        double interrest = amount * rate * years;
        return interrest;
    }
    public static void main(String[] args) {
        try{
            double interest = calculateInterrest(-1000, 10, 10);
            System.out.println("Interrest is " + interest);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
