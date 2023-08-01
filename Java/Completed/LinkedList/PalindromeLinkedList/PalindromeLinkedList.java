package Completed.LinkedList.PalindromeLinkedList;

import java.util.Stack;

//Submission: https://leetcode.com/submissions/detail/924698573/

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode pointer2 = head;
        Stack<Integer> stack = new Stack<Integer>();

        // check size
        while (pointer2 != null) {
            stack.push(pointer2.val);
            pointer2 = pointer2.next;
        }
        int iter = 0;
        while (iter <= stack.size() / 2) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
            iter++;
        }
        return true;
    }
}
