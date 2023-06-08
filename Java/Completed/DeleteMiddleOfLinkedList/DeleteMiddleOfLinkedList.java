package Completed.DeleteMiddleOfLinkedList;

//Submission: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/submissions/966451207/

public class DeleteMiddleOfLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        //Starting with a 0-th node to account for even lists;
        ListNode slow = new ListNode(0,head);

        if (head.next == null) {
            return null;
        }
        //Go through the list and move one pointer twice as fast as the other
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //Move slow once more to find the middle of the list and reassign the pointer
        slow.next = slow.next.next;

        return head;
    }
}
