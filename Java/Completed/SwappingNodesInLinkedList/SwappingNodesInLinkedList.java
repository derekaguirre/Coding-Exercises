package Completed.SwappingNodesInLinkedList;

//Solution: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/submissions/951120760/

class Solution {
    public static void main(String[] args) {
        //Purely for testing output
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        swapNodes(node1, 2);
        while(node1 != null){
            System.out.print(node1.val + " ");
            node1 = node1.next;
        }
        System.out.println();
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode iter = head;
        ListNode tmpNode1 = head;
        ListNode tmpNode2 = head;


        int size = 0;

        //Get the size of the list and the location of the swapped node to use inversely later
        while(iter != null){
            size++;
            if(size == k)
                tmpNode1 = iter;
            iter = iter.next;
        }
        iter = head;
        for (int i = 0;i<=size; i++) {
            if(i == size-k){
                tmpNode2 = iter;
                break;
            }
            iter = iter.next;
        }
        int swapVal = tmpNode1.val;
        tmpNode1.val = tmpNode2.val;
        tmpNode2.val = swapVal;
        return head;
    }
}
