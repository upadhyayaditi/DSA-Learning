package Queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue of integers
        Queue<Integer> queue = new PriorityQueue<>();

        // Adding elements to the priority queue
        queue.add(8);
        queue.add(24);
        queue.add(78);
        queue.add(1);
        queue.add(9);
        queue.add(10);

        // Printing the priority queue (Note: Elements may not appear in the order they were added)
        System.out.println(queue);

        // Removing and printing elements from the priority queue
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // poll() removes and retrieves the head of the queue
        }
    }
}
