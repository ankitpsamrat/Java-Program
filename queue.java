import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.offer("Element 1");
        myQueue.offer("Element 2");
        myQueue.offer("Element 3");

        // Print queue elements
        System.out.println("Queue elements: " + myQueue);

        // Dequeue elements
        String element = myQueue.poll();
        System.out.println("Dequeued element: " + element);

        // Print queue after dequeue
        System.out.println("Queue elements after dequeue: " + myQueue);

        // Peek at the front element without removing it
        String frontElement = myQueue.peek();
        System.out.println("Front element (peek): " + frontElement);

        // Print final queue
        System.out.println("Final Queue: " + myQueue);
    }
}
