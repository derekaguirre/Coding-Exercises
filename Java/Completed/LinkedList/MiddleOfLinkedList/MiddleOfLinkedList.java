package Completed.LinkedList.MiddleOfLinkedList;

//Submission: https://leetcode.com/problems/middle-of-the-linked-list/submissions/949296338/
//Submission2: https://leetcode.com/problems/middle-of-the-linked-list/submissions/1169615360
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        middleNode2(node1);
    }

    public ListNode middleNode(ListNode head) {
        ListNode pointer2 = head;
        int listSize = 0;
        if (head.next == null) {
            return head;
        }
        // compute size of LL
        while (pointer2 != null) {
            pointer2 = pointer2.next;
            listSize++;
        }
        // reset the pointer back to the beginning and move to the middle of the LL
        pointer2 = head;
        for (int i = 1; i < listSize / 2; i++) {
            pointer2 = pointer2.next;
        }
        // //If even, return node after the current one.
        // //If odd, return the current node.
        // if((listSize) % 2 == 0){
        // return pointer2.next;
        // } else if(listSize%2 == 1){
        // return pointer2.next;
        // }
        return pointer2.next;
    }

    public  static ListNode middleNode2(ListNode head) {
        // If size is 0 then return
        if (head.next == null)
            return head;
        // Get size of the list
        ListNode tmp = head;
        int size = 0;
        while (tmp != null) {
            tmp = tmp.next;
            size++;
        }
        // Reset pointer and move to halfway point
        tmp = head;
        for (int i = 1; i < size / 2; i++)
            tmp = tmp.next;
        // Since division rounds down in every case, the node after the one the
        // loop concludes with is the answer all of the time
        return tmp.next;
    }
}
