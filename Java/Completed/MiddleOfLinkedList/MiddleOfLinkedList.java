package Completed.MiddleOfLinkedList;

//Submission: https://leetcode.com/problems/middle-of-the-linked-list/submissions/949296338/
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode pointer2 = head;
        int listSize = 0;
        if (head.next == null) {
            return head;
        }
        //compute size of LL
        while (pointer2 != null) {
            listSize++;
            pointer2 = pointer2.next;
        }
        //reset the pointer back to the beginning and move to the middle of the LL
        pointer2 = head;
        for (int i = 1; i < listSize/2; i++) {
            pointer2 = pointer2.next;
        }
        // //If even, return node after the current one.
        // //If odd, return the current node.
        // if((listSize) % 2 == 0){
        //     return pointer2.next;
        // } else if(listSize%2  == 1){
        //     return pointer2.next;
        // }
        return pointer2.next;
    }
}
