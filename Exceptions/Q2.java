import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter numbers");
            int a = input.nextInt();
            System.out.println("Enter 1numbers");
            int b = input.nextInt();
            try{
                int c = a/b;
                System.out.println(c);
            }catch (ArithmeticException e){
                System.out.println("Error " + e.getMessage());
            }
        }catch (InputMismatchException e){
            System.out.println("Error non-numeric value" + e.getMessage());
        }


    }
}
