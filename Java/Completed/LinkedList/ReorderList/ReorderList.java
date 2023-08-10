package Completed.LinkedList.ReorderList;

//Submission: https://leetcode.com/problems/reorder-list/submissions/1017051902/

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;

        // Find the halfway point in the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Halfway point is found along with defining a prev pointer
        ListNode secondHalfPtr = slow.next, prev = null;
        // Break the list into two with this pointer
        slow.next = null;

        // Reverse second half of list
        while (secondHalfPtr != null) {
            ListNode tmp = secondHalfPtr.next;
            secondHalfPtr.next = prev;
            prev = secondHalfPtr;
            secondHalfPtr = tmp;
        }

        // Merge both halves, prev contains the new head after the loop
        ListNode firstHalfPtr = head;
        secondHalfPtr = prev;

        // Since second half can be shorter, set bounds as the null point of 2nd list
        while (secondHalfPtr != null) {
            // Set temp pointers for both halves
            ListNode tmp1 = firstHalfPtr.next;
            ListNode tmp2 = secondHalfPtr.next;

            // Reassign the pointers to merge both halves
            firstHalfPtr.next = secondHalfPtr;
            secondHalfPtr.next = tmp1;

            // Shift pointers
            firstHalfPtr = tmp1;
            secondHalfPtr = tmp2;
        }
    }
}
