import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class deque_implementation_usin_doubly_linkedlist {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;

        }
    }

    static class deque {
        Node front;
        Node rear;
        int size;

        deque() {
            front = rear = null;
            size = 0;
        }

        boolean isEmpty() {
            if (size == 0)
                return true;
            return false;
        }

        int size() {
            return size;
        }

        void insertfront(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                rear = front = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
            size++;
        }

        void insertRear(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
            } else {
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        void deletefront() {
            if (size == 0) {
                System.out.println("underflow");
            } else {
                Node temp = front;
                front = front.next;

                if (front == null)
                    rear = null;
                else
                    front.prev = null;
                size--;
            }
        }

        void deleterear() {
            if (size == 0)
                System.out.println("queue is empty underflow");
            else {
                Node temp = rear;
                rear = rear.prev;
                if (rear == null) {
                    front = null;

                } else {
                    rear.next = null;
                }
                size--;
            }
        }

        int getRear() {
            if (size == 0){
                System.out.println("underflow");
            return -1;
        }
             return rear.data;

    }
}
public static void main(String[] args) {
    deque dq = new deque();
    System.out.println("inserting 5 at rear end ");
    dq.insertRear(5);
    dq.insertRear(15);
    dq.insertRear(25);
    dq.insertRear(35);
    System.out.println(dq.getRear());
    dq.deleterear();
    System.out.println(dq.getRear());

        }

}


