class ReverseUsingRecursion {
    // Node class represents individual nodes in the linked list
    public static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        // Constructor to initialize node with given data
        Node(int data) {
            this.data = data;
        }
    }

    // MyLinkedList class represents the linked list structure
    public static class MyLinkedList {
        Node head; // Reference to the first node in the linked list
        Node tail; // Reference to the last node in the linked list

        // Constructor to initialize an empty linked list
        MyLinkedList() {
            head = null;
            tail = null;
        }

        // Method to insert a new node with given value at the end of the linked list
        public void insert(int value) {
            Node node = new Node(value); // Create a new node with given value

            // If the list is empty, set both head and tail to the new node
            if (head == null) {
                head = tail = node;
                return;
            } else {
                // Otherwise, add the new node after the current tail and update tail
                tail.next = node;
                tail = node;
                return;
            }
        }

        // Method to reverse the linked list using recursion
        public Node reverseList(Node head) {
            // If the list is empty or has only one node, return the head
            if (head == null || head.next == null) {
                return head;
            }
            // Recursively reverse the rest of the list
            Node rest = reverseList(head.next);
            // Set the next node of the current head to point back to the current head
            Node next = head.next;
            next.next = head;
            head.next = null; // Set the next of current head to null to avoid cycles
            return rest; // Return the reversed list
        }

        // Method to reverse the entire linked list by calling the recursive reverseList method
        public void reverseList() {
            head = reverseList(head); // Update the head after reversing
        }

        // Method to print the elements of the linked list
        public void print() {
            Node current = head; // Start from the head of the linked list
            while (current != null) {
                // Iterate through each node and print its data
                System.out.print(current.data + " --> ");
                current = current.next; // Move to the next node
            }
            System.out.println("null"); // Print null to indicate the end of the linked list
        }
    }

    // Main method to test the functionality of the linked list
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(); // Create a new instance of MyLinkedList

        // Insert some elements into the linked list
        list.insert(6);
        list.insert(8);
        list.insert(10);
        list.insert(17);

        list.print(); // Print the original list

        list.reverseList(); // Reverse the list
        list.print(); // Print the reversed list
    }
}
