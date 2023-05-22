package Completed.AddTwoNumbersLL;

//Submission: https://leetcode.com/problems/add-two-numbers/submissions/954763388/

public class AddTwoNumbersLL {
    public static void main(String[] args) {
        ListNode listOne7 = new ListNode(9, null);
        ListNode listOne6 = new ListNode(9, listOne7);
        ListNode listOne5 = new ListNode(9, listOne6);
        ListNode listOne4 = new ListNode(9, listOne5);
        ListNode listOne3 = new ListNode(9, listOne4);
        ListNode listOne2 = new ListNode(9, listOne3);
        ListNode listOne1 = new ListNode(9, listOne2);
        
        ListNode listTwo4 = new ListNode(9, null);
        ListNode listTwo3 = new ListNode(9, listTwo4);
        ListNode listTwo2 = new ListNode(9, listTwo3);
        ListNode listTwo1 = new ListNode(9, listTwo2);
        
        ListNode sumList = addTwoNumbers(listOne1, listTwo1);

        while(sumList != null){
            System.out.print(sumList.val + " ");
            sumList = sumList.next;
        }
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = new ListNode();
        ListNode sumListPtr = sumList;
        int carryAmount = 0;


        while(l1 != null || l2 != null || carryAmount == 1){
            int currentSum = 0;
            if(l1 != null){
                currentSum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                currentSum+= l2.val;
                l2 = l2.next;
            }
            currentSum += carryAmount;
            carryAmount = currentSum/10;
            ListNode sumTmp = new ListNode(currentSum %10);
            sumListPtr.next = sumTmp;
            sumListPtr = sumListPtr.next;
        }
        return sumList.next;
    }
}