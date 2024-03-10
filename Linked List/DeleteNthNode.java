class DeleteNthNode {

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

        // Method to remove the nth node from the end of the linked list
        public void removeNth(int n) {
            if (head == null) {
                return; // If the list is empty, return without performing any operation
            }

            // Initialize two pointers: fastNode and curNode to traverse the list
            Node fastNode = head;
            Node prevNode = null;
            Node curNode = head;

            // Move the fastNode pointer to the nth node from the beginning
            while (n > 0 && fastNode != null) {
                fastNode = fastNode.next;
                n--;
            }

            // Move both pointers until the fastNode reaches the end of the list
            while (fastNode != null) {
                prevNode = curNode;
                curNode = curNode.next;
                fastNode = fastNode.next;
            }

            // If the node to be removed is the head node
            if (prevNode == null) {
                head = head.next; // Update the head to the next node
                curNode.next = null; // Set the next of the removed node to null
            }

            // Remove the nth node by updating the pointers
            prevNode.next = curNode.next; // Skip the current node by updating the previous node's next
            curNode.next = null; // Set the next of the removed node to null
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
        list.insert(2); // Insert elements into the linked list
        list.insert(5);
        list.insert(9);
        list.insert(10);
        list.insert(17);
        list.insert(7);

        list.print(); // Print the initial contents of the linked list

        list.removeNth(2); // Remove the second element from the end of the linked list

        list.print(); // Print the contents of the linked list after removal
    }
}
