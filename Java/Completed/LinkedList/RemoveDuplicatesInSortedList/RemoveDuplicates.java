package Completed.LinkedList.RemoveDuplicatesInSortedList;
//Submission: https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/959352871/

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null)
        {
            if (temp.next.val==temp.val)
            {
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }
}
