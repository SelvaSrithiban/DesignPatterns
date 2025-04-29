package dsa_Problems.singleLinkedList;

public class RemoveLinkFromLinkedList {

    public ListNode solve(ListNode A) {
        //if LL is empty
        if(A == null){
            return null;
        }
        //Check if Linked List has cycle
        boolean isCyclePresent = false;
        ListNode slow_ptr = A;
        ListNode fast_ptr = A;
        while(fast_ptr.next != null && fast_ptr.next.next != null){
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if(slow_ptr == fast_ptr){
                isCyclePresent = true;
                break;
            }
        }
        //Find the intersection point
        ListNode p1 = A;
        ListNode p2 = slow_ptr;
        if(!isCyclePresent){
            return null;
        }else{
            while(p1 != p2){
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        //Find the last lastnode
        ListNode lastNode = p1;
        while(p1.next != p2){
            p1 = p1.next;
        }
        p1.next = null;
        return A;
    }

}
