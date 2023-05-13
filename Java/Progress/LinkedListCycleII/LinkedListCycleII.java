package LinkedListCycleII;

//Submission: https://leetcode.com/submissions/detail/949364357/

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        // Create new pointer
        ListNode pointer2 = head.next;

        if (head.next == null)
            return head;

        // Iterate
        while (pointer2 != null) {
            if (head != pointer2) {
                head = head.next;
            }
            if(head == pointer2 && head.next == pointer2.next){
                return head;
            }
            pointer2 = pointer2.next;

        }

        return head;
    }
}