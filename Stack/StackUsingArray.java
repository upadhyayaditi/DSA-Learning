package Stack; // Package declaration

public class StackUsingArray { // Class declaration

    // Inner static class to represent the stack
    public static class MyStack { 
        int[] items; // Array to store stack elements
        int top; // Index of the top element
        int size; // Maximum size of the stack

        // Constructor to initialize the stack with a given size
        MyStack(int size) { 
            this.size = size;
            this.items = new int[size]; // Initializing the array
            this.top = 0; // Initializing top to 0 (indicating an empty stack)
        }

        // Method to push an element onto the stack
        public void push(int value) { 
            // Check if the stack is full
            if (top == size) { 
                System.out.println("Stack is Full!");
                return; // Exit the method if the stack is full
            }
            this.items[this.top] = value; // Add the value to the top of the stack
            this.top++; // Increment the top index
        }

        // Method to pop an element from the stack
        public int pop() { 
            // Check if the stack is empty
            if (top == 0) { 
                System.out.println("Stack is Empty");
                return -1; // Return -1 if the stack is empty
            }
            this.top--; // Decrement the top index
            int value = items[top]; // Store the value to be popped
            items[top] = 0; // Clear the value from the array (optional)
            return value; // Return the popped value
        }

        // Method to get the top element of the stack without removing it
        public int peek() { 
            // Check if the stack is empty
            if (top == 0) { 
                System.out.println("Stack is Empty");
                return -1; // Return -1 if the stack is empty
            }
            return items[top - 1]; // Return the top element without removing it
        }

        // Method to print the elements of the stack
        public void print() { 
            // Traverse the stack from top to bottom
            for (int i = items.length - 1; i >= 0; i--) { 
                System.out.print(items[i] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after printing all elements
        }
    }

    // Main method to demonstrate the usage of the stack
    public static void main(String[] args) { 
        MyStack stack = new MyStack(5); // Creating a stack with size 5
        stack.push(8); // Pushing elements onto the stack
        stack.push(9);
        stack.push(10);
        stack.push(3);
        stack.push(5);

        stack.print(); // Printing the elements of the stack

        stack.pop(); // Popping an element from the stack
        stack.pop(); // Popping another element from the stack

        stack.print(); // Printing the elements of the stack after popping

        System.out.println(stack.peek()); // Getting the top element without removing it
    }
}
