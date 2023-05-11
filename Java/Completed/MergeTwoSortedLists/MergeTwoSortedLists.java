package Completed.MergeTwoSortedLists;

//Submission: https://leetcode.com/submissions/detail/924752837/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode(0);
        ListNode mergedListPointer = mergedList;
        if (list1 == null && list2 == null) {
            return list2;
        }

        while (list1 != null || list2 != null) {

            // List 1 Empty
            if (list1 != null && list2 == null) {
                mergedListPointer.next = list1;
                mergedListPointer = mergedListPointer.next;
                list1 = list1.next;
            }
            // List 2 Empty
            else if (list2 != null && list1 == null) {
                mergedListPointer.next = list2;
                mergedListPointer = mergedListPointer.next;
                list2 = list2.next;
            }

            // Both lists not empty
            else if (list1.val < list2.val) {
                mergedListPointer.next = list1;
                list1 = list1.next;
                mergedListPointer = mergedListPointer.next;
            }
            // Current val in list 2 is less than current val of list 1
            else if (list2.val < list1.val) {
                mergedListPointer.next = list2;
                list2 = list2.next;
                mergedListPointer = mergedListPointer.next;
            }

            // Current vals are equal to each other
            else if (list1.val == list2.val) {
                mergedListPointer.next = list1;
                list1 = list1.next;
                mergedListPointer = mergedListPointer.next;

                mergedListPointer.next = list2;
                list2 = list2.next;
                mergedListPointer = mergedListPointer.next;
            }
        }
        return mergedList.next;

    }
}
