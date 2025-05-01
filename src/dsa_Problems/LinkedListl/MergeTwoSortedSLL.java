package dsa_Problems.LinkedListl;

public class MergeTwoSortedSLL {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        //check null
        if(A == null){
            return B;
        }
        if(B == null){
            return A;
        }

        //Create head and tail node 
        ListNode head = null;
        ListNode tail = null;

        //Point head to the lowest value
        if(A.val < B.val){
            head = A;
            tail = A;
            A = A.next;
        }else{
            head = B;
            tail = B;
            B = B.next;
        }

        //Traverse through the LL
        while(A != null && B != null){
            if(A.val < B.val){
                tail.next = A;
                tail = A;
                A = A.next;
            }else{
                tail.next = B;
                tail = B;
                B = B.next;
            }
        }
        //If B has nodes left
        if(A == null){
            tail.next = B;
        }
        //if A has nodes left
        if(B == null){
            tail.next = A;
        }

        return head;
    }

}
