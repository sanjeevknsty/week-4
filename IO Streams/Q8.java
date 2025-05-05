import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Q8 {
    public static void main(String[] args) {
            PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();
        try {
            pos.connect(pis);
        }catch (IOException e){
            e.printStackTrace();
        }
        Thread write = new Thread(() -> {
            try {
                String message = "Hello, Babai";
                pos.write(message.getBytes());
                pos.close();
            } catch (IOException e) {
                System.err.println("Error " + e.getMessage());
            }
        });

        Thread Read = new Thread(()->{
            try {
                byte[] buffer = new byte[4000];
                int bytesRead;
                while ((bytesRead = pis.read(buffer)) != -1) {
                    System.out.println(new String(buffer, 0, bytesRead));
                }
            }catch (IOException e){
                System.err.println("Error " + e.getMessage());
            }
        });

        write.start();
        Read.start();


    }
}
