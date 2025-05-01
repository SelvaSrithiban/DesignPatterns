package dsa_Problems.LinkedListl;

public class ReverseSLL {

    public ListNode reverseList(ListNode A) {
        //check if head is null
        if(A == null){
            return A;
        }

        ListNode prev = null;
        ListNode curr = A;
        ListNode nxt = null;

        while(curr != null){
            //Assign nxt the next node of current
            nxt = curr.next;
            //Assign cur node next pointer to previous
            curr.next = prev;
            //Assign previous to current
            prev = curr;
            //Assign current to next node
            curr = nxt;
        }

        A = prev;

        return A;
       
    }

}
