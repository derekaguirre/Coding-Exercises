package AddTwoNumbersLL;

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
        ListNode sumListHead = sumList;

        boolean carryFlag = false;
        int currentSum = 0;
        int carryAmount = 0;
        // Iterate through the lists
        while (l1 != null || l2 != null) {
            if(carryFlag == true){
                currentSum = l1.val + l2.val + carryAmount;
            } else{
                currentSum = l1.val + l2.val;
            }
            

            //Handling carry flag if adding the prev carry makes another carry
            if (currentSum > 9) {
                carryFlag = true;
                carryAmount = 1;
                if(currentSum == 10 ){
                    currentSum = 0;
                    sumList.val = 0;
                    System.out.println(sumList.val);
                } else{
                    currentSum = currentSum % 10;
                    sumList.val = currentSum;
                    System.out.println(sumList.val);
                }
                sumList.next = new ListNode();
                sumList = sumList.next;
                if(l1!=null){
                    l1 = l1.next;
                }
                if(l2 !=null){
                    l2= l2.next;
                }
            }

            // If carry flag is set (can also set another carry flag)
            if (carryFlag) {
                currentSum = carryAmount + l1.val + l2.val;
                carryAmount = 1;
                //Handle if adding the carry creates another carry
                if (currentSum > 9) {
                    if(currentSum == 10 ){
                        currentSum = 0;
                        sumList.val = 0;
                        System.out.println(sumList.val);
                    } else{
                        currentSum = currentSum % 10;
                        sumList.val = currentSum;
                        System.out.println(sumList.val);
                    }
                    sumList.next = new ListNode();
                    sumList = sumList.next;
                } else{
                    carryFlag = false;
                    sumList.val = l1.val + l2.val;
                    System.out.println(sumList.val);
                    if(l1.next == null || l2.next == null){
                        break;
                    } else{
                        sumList.next = new ListNode();
                        sumList = sumList.next; 
                    }
                }
            } 
            //If no carry flag
            else {
                // Add the value to the list and move forward
                carryFlag = false;
                sumList.val = l1.val + l2.val;
                System.out.println(sumList.val);
                if(l1.next == null || l2.next == null){
                    break;
                } else{
                    sumList.next = new ListNode();
                    sumList = sumList.next; 
                }
            }
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2 !=null){
                l2= l2.next;
            }
        }

        return sumListHead;
    }
}