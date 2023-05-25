package Completed.LinkedListCycleI;

//Submission: https://leetcode.com/problems/linked-list-cycle/submissions/956862999/

public class LinkedListCycleI {
    public boolean hasCycle(ListNode head) {
        // Check for empty list
        if (head == null || head.next == null)
            return false;

        // Create new pointer
        ListNode fast = head, slow = head;

        // Iterate one twice as fast until both pointers match
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow)
                return true;
        }
        return false;
    }
}