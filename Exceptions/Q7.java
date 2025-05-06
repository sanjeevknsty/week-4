import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter  numbers");
        int a = input.nextInt();
        System.out.println("Enter  numbers");
        int b = input.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Operation Completed");
        }
    }
}
