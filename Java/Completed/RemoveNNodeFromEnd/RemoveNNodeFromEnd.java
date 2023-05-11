package Completed.RemoveNNodeFromEnd;

//Submission: https://leetcode.com/submissions/detail/924088132/

public class RemoveNNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer2 = head;
        int listSize = 0;
        if (head.next == null) {
            return null;
        }

        while (pointer2 != null) {
            listSize++;
            pointer2 = pointer2.next;
        }
        pointer2 = head;
        int complement = listSize - n;
        for (int i = 1; i < complement; i++) {
            pointer2 = pointer2.next;
        }
        if (complement == 0) {
            pointer2 = pointer2.next;
            return pointer2;
        } else {
            pointer2.next = pointer2.next.next;
        }

        return head;
    }
}
