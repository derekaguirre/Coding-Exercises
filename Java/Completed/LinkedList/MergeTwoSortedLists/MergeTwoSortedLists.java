package Completed.LinkedList.MergeTwoSortedLists;

//Iterative Submission: https://leetcode.com/problems/merge-two-sorted-lists/submissions/969262424/
//Iterative Submission 2: https://leetcode.com/problems/merge-two-sorted-lists/submissions/1171169037/
//Recursive Submission: https://leetcode.com/problems/merge-two-sorted-lists/submissions/969268590/
//Recursive Submission 2: https://leetcode.com/problems/merge-two-sorted-lists/submissions/1111048420/

class Solution {
    public static void main(String[] args) {
        ListNode list23 = new ListNode(4);
        ListNode list22 = new ListNode(3, list23);
        ListNode list21 = new ListNode(1, list22);

        ListNode list13 = new ListNode(4);
        ListNode list12 = new ListNode(2, list13);
        ListNode list11 = new ListNode(1, list12);

        mergeTwoLists(list11, list21);
    }

    // Iterative Solution
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode(0);
        ListNode curr = mergedList;

        // Check if lists are empty
        if (list1 == null && list2 == null) {
            return list2;
        }

        while (list1 != null || list2 != null) {
            // If one list is empty
            if (list1 != null && list2 == null) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            } else if (list2 != null && list1 == null) {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }

            // If both lists are not empty
            //  List1 smaller
            else if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            //  List2 smaller
            } else if (list2.val < list1.val) {
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;

            //  Equal values
            } else if (list1.val == list2.val) {
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;

                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            }
        }
        return mergedList.next;
    }

    // Recursive Solution
    public ListNode mergeTwoListsRec(ListNode list1, ListNode list2) {
        // If any of the lists are empty then return the respective empty list
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        // If if one list's value is bigger than the other's, then the bigger value's
        // list moves
        if (list1.val < list2.val) {
            list1.next = mergeTwoListsRec(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRec(list1, list2.next);
            return list2;
        }
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        // If the value of the list1 pointer is smaller or equal to the value in list2
        // Then merge those two instances
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists2(list1.next, list2);
            return list1;
        }
        // Otherwise merge the list2
        else {
            list2.next = mergeTwoLists2(list1, list2.next);
            return list2;
        }
    }

}