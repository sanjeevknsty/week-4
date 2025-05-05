import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("sample.jpg");
            byte[] byteData = new byte[(int) inputFile.length()];

            try (FileInputStream fis = new FileInputStream(inputFile)) {
                fis.read(byteData);
            }catch (IOException err){
                System.out.println("Error " + err.getMessage());
            }

            ByteArrayInputStream bais = new ByteArrayInputStream(byteData);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int i;

            while ((i = bais.read(buffer)) != -1) {
                baos.write(buffer, 0, i);
            }

            try (FileOutputStream fos = new FileOutputStream("outputSample.jpg")) {
                fos.write(baos.toByteArray());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
