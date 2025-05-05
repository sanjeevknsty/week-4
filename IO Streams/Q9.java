import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {
    public static void main(String[] args) {
        try{
            BufferedReader  br = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while((line = br.readLine()) != null){
                if(line.contains("error")){

                System.out.println(line);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
