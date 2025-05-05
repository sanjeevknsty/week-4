import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        try {
             long Start = System.nanoTime();
                FileInputStream fis = new FileInputStream("sample.txt");
             FileOutputStream fos = new FileOutputStream("sampleFos.txt");


            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long End = System.nanoTime();
            System.out.println("FOS " + (End-Start));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            long Start = System.nanoTime();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sample.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bufferSampleOutput.txt"));

            byte[] buff= new byte[4090];
            int i;
            while((i=bis.read(buff))!=-1){
                bos.write(buff,0,i);
            }
            System.out.println("Successful");
            bis.close();
            bos.close();
            long End = System.nanoTime();
            System.out.println("BOS " + (End-Start));
        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
