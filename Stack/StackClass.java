package Stack; // Package declaration

import java.util.Stack; // Importing the Stack class from java.util package

class StackClass { // Class declaration
    public static void main(String[] args) { // Main method
        Stack<Integer> stack = new Stack<>(); // Creating a stack to hold integers

        // Adding elements to the stack
        stack.push(5);
        stack.push(9);
        stack.push(10);
        stack.push(18);

        // Printing the contents of the stack
        System.out.println(stack);

        // Checking if the stack is empty
        System.out.println(stack.isEmpty());

        // Removing and printing elements from the stack until it's empty
        while (!stack.isEmpty()) {
            int value = stack.pop(); // Removing the top element from the stack
            System.out.println(value); // Printing the removed element
        }
    }
}
