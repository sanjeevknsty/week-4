import java.io.*;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       try{
           DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
           int rollNumber = 111;
           String name = "SAM";
           double GPA = 9.5;
           dos.writeInt(rollNumber);
           dos.writeUTF(name);
           dos.writeDouble(GPA);
           System.out.println("Successful");
           dos.close();


       }catch (IOException e){
           e.printStackTrace();
       }

        try{
            DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double GPA = dis.readDouble();
            System.out.println(rollNumber + " " + name + " " + GPA);
            dis.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
