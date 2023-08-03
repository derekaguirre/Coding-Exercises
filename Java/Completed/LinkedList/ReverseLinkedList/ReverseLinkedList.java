package Completed.LinkedList.ReverseLinkedList;

import java.util.Stack;

//Submission: https://leetcode.com/submissions/detail/924059958/
//Submission2: https://leetcode.com/problems/reverse-linked-list/submissions/1010800906/

public class ReverseLinkedList {

    //Iterative O(n) time, O(n) space
    public ListNode reverseListStack(ListNode head) {
        if (head == null)
            return head;
        Stack<Integer> stack = new Stack<Integer>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode reverseHead = new ListNode(stack.pop());
        ListNode currentNode = reverseHead;
        while (stack.size() != 0) {
            currentNode.next = new ListNode(stack.pop());
            currentNode = currentNode.next;
        }

        return reverseHead;
    }
    
    //Iterative O(n) time, O(1) space
    public ListNode reverseListIterPointers(ListNode head) {
        if (head == null)
            return head;
        ListNode prev = null, curr = head;
        //Set pointer to prev node
        while(curr != null){
            //Save next for moving forward
            ListNode tmpNext = curr.next;

            //Set the pointer to prev node
            curr.next = prev;

            //Move nodes forward
            prev = curr;
            curr = tmpNext;
        }
        return prev;
    }
}
