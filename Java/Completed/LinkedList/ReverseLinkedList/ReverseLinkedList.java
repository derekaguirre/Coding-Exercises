package Completed.LinkedList.ReverseLinkedList;

import java.util.Stack;

//Submission: https://leetcode.com/submissions/detail/924059958/

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        Stack<Integer> stack = new Stack<Integer>();
        
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode reverseHead = new ListNode(stack.pop());
        ListNode currentNode = reverseHead;
        while(stack.size() != 0){
            currentNode.next = new ListNode(stack.pop());
            currentNode = currentNode.next;
        }
            
        
        return reverseHead;
    }
}
