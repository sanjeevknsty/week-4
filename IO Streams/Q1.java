import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {

        try{
            FileInputStream  fis = new FileInputStream("sample.txt");
            FileOutputStream fos = new FileOutputStream("sampleFos.txt");

            int i;
            while((i=fis.read())!=-1){
                fos.write(i);
            }
            System.out.println("Successful");
            fis.close();
            fos.close();
        }catch(IOException err){

            System.out.println("Error " + err.getMessage());
        }
    }
}
