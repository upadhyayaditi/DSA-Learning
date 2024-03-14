package Queue;

// Defining a class for Queue using Array
class QueueUsingArray {
    
    // Creating a nested class for Queue
    public static class MyQueue {
        private int[] items; // Array to store elements of the queue
        private int front;   // Pointer to the front of the queue
        private int rear;    // Pointer to the rear of the queue
        private int size;    // Maximum capacity of the queue
        private int count;   // Current number of elements in the queue

        // Constructor to initialize the queue with a given capacity
        MyQueue(int capacity) {
            this.items = new int[capacity]; // Initializing the array with given capacity
            this.front = 0;   // Initializing front pointer to 0 (empty queue)
            this.rear = 0;    // Initializing rear pointer to 0 (empty queue)
            this.size = capacity; // Setting the maximum size of the queue
            this.count = 0;   // Initializing the count of elements to 0
        }

        // Method to add an element to the rear of the queue
        public void enqueue(int value) {
            // Checking if the queue is full
            if (count == size) {
                System.out.println("Queue is full!"); // Printing a message if the queue is full
                return; // Exiting the method
            }
            items[rear] = value; // Adding the value to the rear of the queue
            rear = (rear + 1) % size; // Moving the rear pointer forward in a circular manner
            count++; // Incrementing the count of elements
        }

        // Method to remove an element from the front of the queue
        public int dequeue() {
            // Checking if the queue is empty
            if (count == 0) {
                System.out.println("Queue is empty"); // Printing a message if the queue is empty
                return -1; // Returning a sentinel value (-1) to indicate an empty queue
            }
            int value = items[front]; // Storing the value at the front of the queue
            front = (front + 1) % size; // Moving the front pointer forward in a circular manner
            count--; // Decrementing the count of elements
            return value; // Returning the removed value
        }

        // Method to print the elements of the queue
        public void print() {
            int i = front; // Start from the front of the queue
            int elementsPrinted = 0; // Track how many elements have been printed
            while (elementsPrinted < count) { // Continue until all elements are printed
                System.out.print(items[i] + " "); // Print the current element
                i = (i + 1) % size; // Move to the next element in a circular manner
                elementsPrinted++; // Increment the count of elements printed
            }
            System.out.println(); // Printing a new line after printing all elements
        }
    }

    // Main method to test the Queue implementation
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5); // Creating a queue with a capacity of 5
        queue.enqueue(7); // Adding elements to the queue
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(12);
        queue.enqueue(15);

        queue.print(); // Printing the elements of the queue
        System.out.println(queue.dequeue()); // Removing an element from the queue and printing it
        queue.dequeue();
        queue.print(); // Printing the elements of the queue after dequeue operation
        queue.enqueue(23);
        queue.print(); // Printing the elements of the queue after enqueue operation
        System.out.println();
        queue.enqueue(18);
        queue.print(); // Printing the elements of the queue after another enqueue operation
    }
}
