import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        try{
            BufferedReader fr = new BufferedReader(new FileReader("data1.txt"));
            String i;
            while(( i= fr.readLine())!= null){
                System.out.println(i);
            }
            fr.close();
        }catch (IOException e){
            System.out.println("IO Exception " + e.getMessage());
        }
    }
}
