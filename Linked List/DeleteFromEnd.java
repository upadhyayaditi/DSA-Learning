class DeleteFromEnd {

    // Node class representing each element in the linked list
    public static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node in the linked list

        // Constructor to initialize a node with given data
        Node(int data) {
            this.data = data;
        }
    }

    // MyLinkedList class representing the linked list structure
    public static class MyLinkedList {
        Node head; // Reference to the first node in the linked list
        Node tail; // Reference to the last node in the linked list

        // Constructor to initialize an empty linked list
        MyLinkedList() {
            head = null; // Initialize head to null (empty list)
            tail = null; // Initialize tail to null (empty list)
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

        // Method to remove the last node from the linked list
        public void removeEnd() {
            if (head == null) {
                // If the list is empty, do nothing
                return;
            } else {
                Node currNode = head;
                Node prevNode = null;

                // Traverse the list until the current node reaches the last node
                while (currNode.next != null) {
                    prevNode = currNode; // Keep track of the previous node
                    currNode = currNode.next; // Move to the next node
                }

                if (prevNode == null) {
                    // If there's only one node in the list, remove it by setting head to null
                    head = null;
                } else {
                    // Remove the last node by setting the next reference of the previous node to null
                    prevNode.next = null;
                }
                return;
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
            System.out.println("null"); // Print null to indicate the end of the linked list
        }

    }

    // Main method to demonstrate the functionality of the linked list
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(); // Create a new linked list instance
        list.insert(6); // Insert elements into the linked list
        list.insert(10);
        list.insert(5);
        list.insert(8);
        list.insert(9);

        list.print(); // Print the initial contents of the linked list

        list.removeEnd(); // Remove the last element from the linked list

        list.print(); // Print the contents of the linked list after removal
    }
}
