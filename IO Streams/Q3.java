import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        int age = input.nextInt();
//        String programmingLang = input.nextLine();
        try{
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String name = br.readLine();
            int age = Integer.parseInt(br.readLine());
            String programmingLang = br.readLine();
            System.out.println(name + " "+ age + " " +  programmingLang);
        }catch(IOException err){
            System.out.println("Error " + err.getMessage());
        }
    }
}
