public class InsertAtFirst {
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

        // Method to check if the linked list is empty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Method to insert a new node with the given value at the end of the linked
        // list
        public void insert(int value) {
            Node node = new Node(value); // Create a new node with the given value

            // If the linked list is empty, set both head and tail to the new node
            if (isEmpty()) {
                head = tail = node;
            } else {
                // If the linked list is not empty, append the new node to the end
                tail.next = node;
                tail = node; // Update the tail reference to the new node
            }
        }

        // Method to insert a new node with the given value at the beginning of the
        // linked list
        public void insertAtbegining(int value) {
            Node node = new Node(value); // Create a new node with the given value

            // If the linked list is empty, set both head and tail to the new node
            if (isEmpty()) {
                head = tail = node;
            } else {
                // Set the next of the new node to the current head
                node.next = head;
                head = node; // Update the head reference to the new node
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

        // Insert elements into the linked list
        list.insert(56);
        list.insert(45);
        list.insert(9);

        // Insert elements at the beginning of the linked list
        list.insertAtbegining(2);
        list.insertAtbegining(7);

        // Print the elements of the linked list
        list.print();
    }
}
