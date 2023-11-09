package Progress.SwapAdjacentNodes;

public class SwapAdjacentNodes {
    public static void main(String[] args) {
        ListNode listTwo4 = new ListNode(4, null);
        ListNode listTwo3 = new ListNode(3, listTwo4);
        ListNode listTwo2 = new ListNode(2, listTwo3);
        ListNode listTwo1 = new ListNode(1, listTwo2);

        swapPairs(listTwo1);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode curr = head.next.next;
        ListNode prev = head;
        head = head.next; // Swapping first two nodes outside loop to maintain head.
        head.next = prev;
        while (curr != null && curr.next != null) {
            prev.next = curr.next;
            prev = curr;
            ListNode nxt = curr.next.next; // Create new node nxt to keep hold of linked list.
            curr.next.next = curr;
            curr = nxt;
        }
        prev.next = curr;
        return head;
    }
}
