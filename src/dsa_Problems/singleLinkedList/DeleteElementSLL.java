package dsa_Problems.singleLinkedList;

class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
     }

public class DeleteElementSLL {

    public ListNode solve(ListNode A, int B, int C) {

        //create a new node 
        ListNode newNode = new ListNode(B);

        //check null
        if(A == null){
            return newNode;
        }

        //if insertion position is head
        if(C == 0){
            newNode.next = A;
            return newNode;
        }

        ListNode t = A;
        int i = 0;
        //Traverse until C-1
        while(i < C -1 && t.next != null){
            t = t.next;
            i++;
        }

        //insert the new value
        newNode.next = t.next;
        t.next = newNode;

        return A;
    }

}
