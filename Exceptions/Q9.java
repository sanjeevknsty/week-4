import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {12,45,2,34,54};
        int divisor = 0;
        try{
            int i = arr[1];
            try {
                int c = i / divisor;
                System.out.println(c);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage() + " Cannot divide by zero!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage() + " Invalid array index!");
        }
    }
}
