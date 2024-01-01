import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Add elements to the queue
        q.offer(1);
        q.offer(2);
        q.offer(3);

        // Print queue elements
        System.out.println("Queue elements: " + q);

        // Dequeue elements
        Integer element = q.poll();
        System.out.println("Dequeued element: " + element);

        // Print queue after dequeue
        System.out.println("Queue elements after dequeue: " + q);

        // Peek at the front element without removing it
        Integer frontElement = q.peek(); 
        System.out.println("Front element (peek): " + frontElement);

        // Print final queue
        System.out.println("Final Queue: " + q);
    }
}
