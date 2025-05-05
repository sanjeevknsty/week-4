import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class CircularArray{
    private ArrayList<Integer> arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    int temp = 0;
    public CircularArray(int sizeArr){
        this.capacity = sizeArr;
        this.arr = new ArrayList<>();
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(int x){
        rear = (rear+1)%capacity;
        System.out.println("rear " + rear+ " Front " + front);
//        int ind = arr.get(rear) ;
        arr.add(rear,x);

        if(size == capacity){
            front = (front+1)%capacity;
            System.out.println("front " + front);
        }
        else{
            size++;
        }
        temp=0;
    }

    public void deque(){

        int deletd = arr.remove(0);
        front= (front+1) % capacity;
        System.out.println(front + " " + rear);
        size--;
        System.out.println(deletd);

    }
    public void disPlay(){
        System.out.println(size + " Size");
        for(int i = 0 ; i<size; i++){

            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

}
public class Q5 {
    public static void main(String[] args) {
        CircularArray circularArray = new CircularArray(5);
        circularArray.enqueue(10);
        circularArray.enqueue(20);
        circularArray.enqueue(30);
        circularArray.enqueue(40);
        circularArray.enqueue(50);
        circularArray.enqueue(60);
        circularArray.enqueue(70);

        circularArray.disPlay();
        System.out.println("Deququeee");
        circularArray.deque();
        circularArray.deque();
        circularArray.enqueue(100);
        circularArray.deque();

        System.out.println("**");
        circularArray.disPlay();
    }
}
