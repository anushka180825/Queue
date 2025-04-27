import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_a_queue_using_stack{
    static Queue<Integer> queue;
    static  void print()
    {
        System.out.println(queue);
    }
    static void reversequence()
    {
        Stack<Integer> st =new Stack<>();
        while(!queue.isEmpty())
        {
            st.push(queue.remove());
        }
        while (!st.isEmpty())
        {
            queue.add(st.pop());
        }
    }
    public static void main(String[] args) {
         queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        print();
        reversequence();
        print();


        }
    }

