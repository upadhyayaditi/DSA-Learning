package Queue; // Package declaration

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue { // Class declaration
    public static void main(String[] args) { // Main method
        Queue<Integer> queue = new LinkedList<>(); // Creating a queue using LinkedList
        Stack<Integer> stack = new Stack<>(); // Creating a stack

        // Adding elements to the queue
        queue.add(6);
        queue.add(8);
        queue.add(2);
        queue.add(9);

        System.out.println("Before Reversing : " + queue); // Printing the contents of the queue before reversing

        // Reversing the queue using a stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll()); // Removing elements from the queue and pushing them onto the stack
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop()); // Popping elements from the stack and adding them back to the queue
        }

        System.out.println("After reversing : " + queue); // Printing the contents of the queue after reversing
    }
}
