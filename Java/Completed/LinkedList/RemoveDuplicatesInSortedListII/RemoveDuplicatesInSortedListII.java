package Completed.LinkedList.RemoveDuplicatesInSortedListII;

//Submission: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/1082625851/

public class RemoveDuplicatesInSortedListII {
    public static void main(String[] args) {
        ListNode node8 = new ListNode(5, null);
        ListNode node7 = new ListNode(4, node8);
        ListNode node6 = new ListNode(4, node7);
        ListNode node5 = new ListNode(3, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode res = deleteDuplicates(node1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prevPrev = null;
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            prevPrev = prev;
            prev = curr;
            int value = curr.val;
            int flag = 0;
            while (curr.next != null && curr.next.val == value) {
                curr = curr.next;
                flag = 1;
            }
            if (flag == 1) {
                if (prevPrev == null) {
                    head = curr.next;
                    prev = null;
                    prevPrev = null;
                } else {
                    prev = prevPrev;
                    prevPrev.next = curr.next;
                }
            }
            curr = curr.next;
        }

        return head;
    }
}
