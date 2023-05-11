package Completed.DeleteNodeInLinkedList;

//Submission: https://leetcode.com/submissions/detail/924033353/

class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}