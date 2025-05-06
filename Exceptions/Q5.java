import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String i;
            if((i = br.readLine())!= null){
                System.out.println(i);
            }
        }catch (IOException e){
            System.out.println("Error reading file");
        }
    }
}
