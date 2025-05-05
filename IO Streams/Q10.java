import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q10 {
    public static void main(String[] args) {
        HashMap<String,Integer> hash = new HashMap<>();
        try{
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        while((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
            for (String word : words) {
                hash.put(word, hash.getOrDefault(word, 0) + 1);
            }

        }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(hash);
    }
}
