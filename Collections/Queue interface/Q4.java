import java.util.LinkedList;
import java.util.Queue;

public class Q4 {
    public static Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    public  void push(Integer x){
        queue1.add(x);

    }
    public Integer pop(){
        if(queue1.isEmpty()){
            return null;
        }
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return queue2.poll();

    }

    public Integer  peek(){
        if(queue1.isEmpty()){
            return null;
        }
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }
        int top = queue1.peek();
        queue2.add(queue1.poll());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }

    @Override
    public String toString(){
        return queue1.toString();
    }
    public static void main(String[] args) {

        Q4 stack = new Q4();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println( "pop "+stack.pop());
        System.out.println( "peak "+stack.peek());
        System.out.println(stack);
    }
}
