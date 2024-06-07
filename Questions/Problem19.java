//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode fastNode = head;
        ListNode curNode = head;
        ListNode prevNode = null;

        while (n > 0 && fastNode != null) {
            fastNode = fastNode.next;
            n--;
        }

        while (fastNode != null) {
            prevNode = curNode;
            curNode = curNode.next;
            fastNode = fastNode.next;
        }
        if (prevNode == null) {
            head = head.next;
            curNode.next = null;
            return head;
        }
        prevNode.next = curNode.next;
        curNode.next = null;
        return head;
    }
}