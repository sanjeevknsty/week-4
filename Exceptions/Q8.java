import java.io.IOException;

public class Q8 {
    public static void method1(int a,int b) {

        int c = a/b;
        System.out.println(c);
    }
    public static void method2(){
        method1(10,0);

    }
    public static void main(String[] args) {
        try{
        method2();
        }catch (ArithmeticException e){
            System.out.println("Handled exception in main");
        }
    }
}
