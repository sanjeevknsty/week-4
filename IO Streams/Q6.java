import java.io.*;

public class Q6 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("sampleFos.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            System.out.println("Successful");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
