package Queue;

import java.util.Stack;

public class QueueUsingStack {
    public static class MyQueue {
        private Stack<Integer> s1; // Main stack for enqueue operation
        private Stack<Integer> s2; // Auxiliary stack for dequeue operation

        // Constructor to initialize stacks
        MyQueue() {
            this.s1 = new Stack<>();
            this.s2 = new Stack<>();
        }

        // Method to add an element to the queue
        public void enqueue(int value) {
            s1.push(value); // Simply push the value onto stack s1
        }

        // Method to remove and return an element from the queue
        public int dequeue() {
            // If both stacks are empty, queue is empty
            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // If stack s2 is empty, transfer elements from s1 to s2
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop()); // Pop from s1 and push to s2, effectively reversing the order
                }
            }
            // Pop from s2 to return the front element of the queue
            return s2.pop();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        // Enqueue some elements to the queue
        queue.enqueue(67);
        queue.enqueue(6);
        queue.enqueue(9);
        queue.enqueue(3);

        // Dequeue and print the elements from the queue
        System.out.print(queue.dequeue() + "  ");
        System.out.print(queue.dequeue() + "  ");
        System.out.print(queue.dequeue() + "  ");
        System.out.print(queue.dequeue() + "  ");
    }
}
