public class Traversal {
    // Node class to represent each element in the linked list
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize the data of the node
        Node(int data) {
            this.data = data;
        }
    }

    // MyLinkedList class to manage the linked list
    public static class MyLinkedList {
        Node head; // Reference to the first node in the linked list
        Node tail; // Reference to the last node in the linked list

        // Constructor to initialize an empty linked list
        MyLinkedList() {
            head = null;
            tail = null;
        }

        // Method to insert a new node with the given value at the end of the linked
        // list
        public void insert(int value) {
            Node node = new Node(value); // Create a new node with the given value
            if (head == null) {
                // If the linked list is empty, set both head and tail to the new node
                head = tail = node;
            } else {
                // If the linked list is not empty, append the new node to the end
                tail.next = node;
                tail = node; // Update the tail reference to the new node
            }
        }

        // Method to calculate the sum of all elements in the linked list
        public int sum() {
            Node currNode = head; // Start from the head of the linked list
            int sum = 0; // Initialize the sum to 0
            while (currNode != null) {
                // Iterate through each node and add its data to the sum
                sum += currNode.data;
                currNode = currNode.next; // Move to the next node
            }
            return sum; // Return the sum of all elements
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(); // Create an instance of MyLinkedList

        // Insert elements into the linked list
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Print the sum of all elements in the linked list
        System.out.println(list.sum());
    }
}
