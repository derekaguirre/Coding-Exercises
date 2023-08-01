package Completed.LinkedList.MergeTwoSortedLists;

//Iterative Submission: https://leetcode.com/problems/merge-two-sorted-lists/submissions/969262424/
//Recursive Submission: https://leetcode.com/problems/merge-two-sorted-lists/submissions/969268590/

class Solution {

    //Iterative Solution
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode(0);
        ListNode mergedListPointer = mergedList;
        //Check if both lists are empty
        if(list1 == null && list2 == null){
            return list2;
        }
            
        while(list1 != null || list2 != null ){    


            
            //If list 1 has a bigger value then add that to the new list first
            if(list1.val < list2.val){
                mergedListPointer.next = list1;
                list1 = list1.next;
                mergedListPointer = mergedListPointer.next;

            }
            //If list 2 has a bigger value then add that to the new list first
            else if(list2.val < list1.val){
                mergedListPointer.next = list2;
                list2 = list2.next;
                mergedListPointer = mergedListPointer.next;
            }
            //If both lists have the same value then add both with no respect to the order
            else if(list1.val == list2.val){                
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

    //Recursive Solution
    public ListNode mergeTwoListsRec(ListNode list1, ListNode list2) {
        //If any of the lists are empty then return the respective empty list
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        //If if one list's value is bigger than the other's, then the bigger value's list moves 
        if(list1.val < list2.val){
            list1.next = mergeTwoListsRec(list1.next, list2);
            return list1;
        } else{
            list2.next = mergeTwoListsRec(list1, list2.next);
            return list2;
        }
    }
}