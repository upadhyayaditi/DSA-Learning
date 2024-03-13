package Stack; // Package declaration

public class StackUsingLinkedList { // Class declaration

    // Node class to represent each element in the linked list
    public static class Node { 
        int data; // Data stored in the node
        Node next; // Reference to the next node

        // Constructor to initialize a node with given data
        Node(int data) { 
            this.data = data; // Set the data of the node
        }
    }

    // LinkedList class to represent the stack using a linked list
    public static class MyLinkedList { 
        Node head; // Reference to the head node of the linked list
        int size; // Size of the linked list

        // Constructor to initialize the linked list
        MyLinkedList() { 
            head = null; // Initialize head to null (indicating an empty list)
            size = 0; // Initialize size to 0
        }

        // Method to push an element onto the stack
        public void push(int value) { 
            Node node = new Node(value); // Create a new node with the given value
            if (head == null) { // If the list is empty
                head = node; // Set the new node as the head
                return;
            }
            node.next = head; // Set the next of the new node to the current head
            head = node; // Update the head to the new node
            return;
        }

        // Method to pop an element from the stack
        public void pop() { 
            if (head == null) { // If the list is empty
                return; // There's nothing to pop
            }
            Node curNode = head; // Save a reference to the current head
            head = head.next; // Move the head to the next node
            curNode.next = null; // Clear the next reference of the popped node
            return;
        }

        // Method to print the elements of the stack
        public void print() { 
            Node currNode = head; // Start from the head of the list
            while (currNode != null) { // Traverse until the end of the list
                System.out.print(currNode.data + " --> "); // Print the data of the current node
                currNode = currNode.next; // Move to the next node
            }
            System.out.println("null"); // Print 'null' to indicate the end of the list
        }
    }

    // Main method to demonstrate the usage of the stack implemented with a linked list
    public static void main(String[] args) { 
        MyLinkedList list = new MyLinkedList(); // Create a new linked list instance
        list.push(7); // Push elements onto the stack
        list.push(5);
        list.push(8);
        list.push(10);

        list.print(); // Print the elements of the stack

        list.pop(); // Pop an element from the stack
        list.pop(); // Pop another element from the stack

        list.print(); // Print the elements of the stack after popping
    }
}
