package AddTwoNumbersLL;

public class AddTwoNumbersLL{
    public static void main(String[] args) {
        
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = new ListNode();
        ListNode sumListHead = sumList;

        boolean carryFlag = false;
        int currentSum = 0;
        int carryAmount = 0;
        //Iterate through the lists
        while(l1.next != null && l2.next != null){
            currentSum = l1.val + l2.val;
            if(currentSum > 9){
                carryFlag = true;
                carryAmount = currentSum-10;
                //Add a 0 to the list and move forward
                sumList.val = 0;
                sumList.next = null;
                sumList = sumList.next;
            }

            //If carry flag is set (can also set another carry flag)
            if(carryFlag){
                currentSum += carryAmount;
                if(currentSum > 9){
                    carryFlag = true;
                    carryAmount = currentSum-10;
                    //Add a 0 to the list and move forward
                    sumList.val = 0;
                    sumList.next = null;
                    sumList = sumList.next;
                }
            } else{
                //Add the value to the list and move forward
                sumList.val = currentSum;
                sumList.next = null;
                sumList = sumList.next;
            }
        }

        return sumListHead;
    }
}