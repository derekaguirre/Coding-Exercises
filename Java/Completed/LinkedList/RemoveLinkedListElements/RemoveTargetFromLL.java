package Completed.LinkedList.RemoveLinkedListElements;

//Submission: https://leetcode.com/problems/remove-linked-list-elements/submissions/977539254/

public class RemoveTargetFromLL {
    public static void main(String[] args) {
        // ListNode listOne7 = new ListNode(6, null);
        // ListNode listOne6 = new ListNode(5, listOne7);
        // ListNode listOne5 = new ListNode(4, listOne6);
        // ListNode listOne4 = new ListNode(3, listOne5);
        // ListNode listOne3 = new ListNode(6, listOne4);
        // ListNode listOne2 = new ListNode(2, listOne3);
        // ListNode listOne1 = new ListNode(1, listOne2);
        // ListNode listOne4 = new ListNode(7, null);
        // ListNode listOne3 = new ListNode(7, listOne4);
        // ListNode listOne2 = new ListNode(7, listOne3);
        // ListNode listOne1 = new ListNode(7, listOne2);
        ListNode test2 = new ListNode(2, null);
        ListNode test = new ListNode(1, test2);

        removeElements(test, 1);
    }

    public static ListNode removeElements(ListNode head, int target) {
        if (head == null)
            return null;

        ListNode slow = head;
        while (slow.next != null) {
            // If target is found on the next node, then skip that node
            if (slow.next.val == target)
                slow.next = slow.next.next;
            else
                slow = slow.next;
        }
        return head.val == target ? head.next : head;
    }
}
