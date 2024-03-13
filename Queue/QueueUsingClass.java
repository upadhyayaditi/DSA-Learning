package Queue; // Package declaration

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingClass { // Class declaration
    public static void main(String[] args) { // Main method
        Queue<Integer> queue = new LinkedList<>(); // Creating a queue using LinkedList

        // Adding elements to the queue
        queue.add(6);
        queue.add(8);
        queue.add(2);
        queue.add(9);

        System.out.println(queue); // Printing the contents of the queue

        queue.remove(); // Removing an element from the queue
        System.out.println(queue); // Printing the contents of the queue after removal

        System.out.println(queue.peek()); // Printing the element at the front of the queue
    }
}
