import java.io.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name,String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.department + " " + this.salary;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Employee emp = new Employee(11,"ram","Developer",22332);
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sampleOOS.ser"));
            oos.writeObject(emp);
            System.out.println("Successful");

        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sampleOOS.ser"));
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println(deserializedEmp);

        }catch (IOException | ClassNotFoundException e){
            e.getMessage();
        }
    }
}
