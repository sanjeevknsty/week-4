import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
    HashMap<String,Integer> hashMap = new HashMap<>();
        try {

        BufferedReader br = new BufferedReader(new FileReader("sample"));
        String line ;
        while ((line = br.readLine()) != null){
           String arr[] = line.split(" ");
           for(int i = 0; i < arr.length; i++){
               if( !hashMap.containsKey(arr[i])){
                   hashMap.put(arr[i],1);
               }else {
                   hashMap.put(arr[i],hashMap.get(arr[i])+1);
               }
           }


        }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(hashMap);
    }
}

