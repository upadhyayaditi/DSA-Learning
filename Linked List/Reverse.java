public class Reverse {
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

            // If the linked list is empty, set both head and tail to the new node
            if (head == null) {
                head = tail = node;
            } else {
                // If the linked list is not empty, append the new node to the end
                tail.next = node;
                tail = node; // Update the tail reference to the new node
            }
        }

        // Method to reverse the linked list
        public void reverse() {
            // If the linked list is empty or has only one node, no need to reverse
            if (head == null || head.next == null) {
                return;
            }

            Node prevNode = null;
            Node currNode = head;
            Node nextNode = head.next;

            while (nextNode != null) {
                // Reverse the link of the current node
                currNode.next = prevNode;
                // Move to the next nodes
                prevNode = currNode;
                currNode = nextNode;
                nextNode = nextNode.next;
            }

            // Reverse the link of the last node
            currNode.next = prevNode;
            // Update the head reference to the last node
            head = currNode;
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

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(); // Create an instance of MyLinkedList

        // Insert elements into the linked list
        list.insert(23);
        list.insert(2);
        list.insert(4);
        list.insert(15);
        list.insert(20);

        // Print the elements of the linked list before reversing
        list.print();

        // Reverse the linked list
        list.reverse();

        // Print the elements of the linked list after reversing
        list.print();
    }
}
