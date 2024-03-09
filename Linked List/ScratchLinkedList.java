public class ScratchLinkedList {

    // Node class to represent each element in the linked list
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize the data of the node
        public Node(int data) {
            this.data = data;
        }
    }

    // MyLinkedList class to manage the linked list
    public static class MyLinkedList {
        public Node head; // Reference to the first node in the linked list
        public Node tail; // Reference to the last node in the linked list

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
                head = node;
                tail = node;
            } else {
                // If the linked list is not empty, append the new node to the end
                tail.next = node;
                tail = node; // Update the tail reference to the new node
            }
        }

        // Method to print the elements of the linked list
        public void print() {
            Node current = head; // Start from the head of the linked list
            while (current != null) {
                // Iterate through each node and print its data
                System.out.print(current.data + " --> ");
                current = current.next; // Move to the next node
            }
            System.out.print("null"); // Print null to indicate the end of the linked list
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(); // Create an instance of MyLinkedList
        list.insert(67); // Insert elements into the linked list
        list.insert(23);
        list.insert(34);
        list.insert(5);

        list.print(); // Print the elements of the linked list
    }
}
