package Progress.addTwoNumsLL;
import java.util.Stack;

//Submission: https://leetcode.com/problems/add-two-numbers-ii/submissions/977537747/

public class AddTwoNumsLL {
    public static void main(String[] args) {
        ListNode listOne4 = new ListNode(3, null);
        ListNode listOne3 = new ListNode(4, listOne4);
        ListNode listOne2 = new ListNode(2, listOne3);
        ListNode listOne1 = new ListNode(7, listOne2);

        ListNode listTwo3 = new ListNode(4, null);
        ListNode listTwo2 = new ListNode(6, listTwo3);
        ListNode listTwo1 = new ListNode(5, listTwo2);

        addTwoNumbers(listOne1, listTwo1);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode list = new ListNode(0);
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            //Ensure no numbers above 9
            list.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }
        
        return list.val == 0 ? list.next : list;
    }
}
