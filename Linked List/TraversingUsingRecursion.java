class TraversingUsingRecursion {
    // Node class for creating nodes in the linked list
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // LinkedList class for managing the linked list
    public static class MyLinkedList {
        private Node head; // Pointer to the first node in the list
        private Node tail; // Pointer to the last node in the list

        // Constructor to initialize an empty linked list
        MyLinkedList() {
            head = null;
            tail = null;
        }

        // Method to insert a new node with given value at the end of the list
        public void insert(int value) {
            Node node = new Node(value); // Create a new node with the given value
            if (head == null) { // If the list is empty
                head = tail = node; // Make both head and tail point to the new node
                return; // Exit the method
            } else { // If the list is not empty
                tail.next = node; // Make the current tail node point to the new node
                tail = node; // Update the tail pointer to the new node
                return; // Exit the method
            }
        }

        // Method to recursively print the elements of the list starting from the given node
        private void print(Node head) {
            if (head == null) { // Base case: if the current node is null, exit recursion
                return;
            }
            System.out.print(head.data + " --> "); // Print the data of the current node
            print(head.next); // Recursively call the print method with the next node
        }

        // Method to start printing the elements of the list from the head
        public void print() {
            print(head);
        }

    }

    // Main method to test the linked list implementation
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(); // Create a new instance of MyLinkedList
        list.insert(6); // Insert elements into the list
        list.insert(10);
        list.insert(4);
        list.insert(8);
        list.insert(2);

        list.print(); // Print the elements of the list
    }
}
