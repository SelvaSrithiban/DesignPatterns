package heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
    }


public class MergeKSortedLinkedLists {

    public ListNode mergeKLists(ArrayList<ListNode> a) {

        //check null
        if(a == null || a.size() == 0){
            return null;
        }

        int n = a.size();
        //create prioroty queue
        PriorityQueue<ListNode> queue = new PriorityQueue<>((n1,n2) -> Integer.compare(n1.val, n2.val));
        //add first node of every linked list
        for(ListNode node : a){
             if (node != null) {
                 queue.add(node);
              }       
        }

        //create dummy,curr node
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        //Traverse until queue has element
        while(queue.size() > 0){
            //Remove the peek element from queue
            curr.next = queue.poll();
            //Move to current pointer
            curr = curr.next;

            //Add the next node removed to the queue
            if(curr.next != null){
                queue.add(curr.next);
            }

        }

        return dummy.next;

	}

}
