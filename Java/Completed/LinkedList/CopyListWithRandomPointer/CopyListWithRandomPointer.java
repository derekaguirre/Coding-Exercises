package Completed.LinkedList.CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

//Submission: https://leetcode.com/problems/copy-list-with-random-pointer/submissions/1072339195/

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        // Creating a copy of all the nodes and associating the original to the copy for
        // later
        Map<Node, Node> map = new HashMap<Node, Node>();
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Assign all the pointers (next and random ptrs)
        curr = head;
        while(curr != null){
            //The "next" pointer of the copied node will receive the pointer from the original
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
