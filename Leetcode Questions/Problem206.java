// https://leetcode.com/problems/reverse-linked-list/description/

class Problem206 {
    // Method to reverse a linked list
    public ListNode reverseList(ListNode head) {
        // If the list is empty or has only one node, return the head
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize pointers for previous, current, and next nodes
        ListNode prevNode = null; // Points to the previous node
        ListNode currNode = head; // Points to the current node
        ListNode nextNode = head.next; // Points to the next node

        // Traverse the list and reverse the pointers
        while (nextNode != null) {
            currNode.next = prevNode; // Reverse the pointer of the current node
            prevNode = currNode; // Move prevNode to the current node
            currNode = nextNode; // Move currNode to the next node
            nextNode = nextNode.next; // Move nextNode to the next node
        }

        currNode.next = prevNode; // Reverse the pointer of the last node
        return currNode; // Return the new head of the reversed list
    }
}
