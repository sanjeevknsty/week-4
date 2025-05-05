import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Patient {
    String name;
    int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}
public class Q3 {
    public static void main(String[] args) {

        Patient p1 = new Patient("ramu",4);
        Patient p2 = new Patient("raju",1);
        Patient p3 = new Patient("rev",7);
        Patient p4 = new Patient("rambo",8);

        PriorityQueue<Patient> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.priority));
        queue.add(p1);
        queue.add(p2);
        queue.add(p3);
        queue.add(p4);
        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println(p.name + " (Priority: " + p.priority + ")");
        }
    }
}
