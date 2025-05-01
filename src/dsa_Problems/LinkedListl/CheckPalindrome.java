package dsa_Problems.LinkedListl;

class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
}

public class CheckPalindrome {

    public ListNode reverseLinkedList(ListNode cur){
        ListNode pre = null;
        ListNode next = null;

        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    public int checkPalindrome(ListNode first_half, ListNode second_half){
        int res = 1;
        while(first_half != null && second_half != null){
            if(first_half.val == second_half.val){
                first_half = first_half.next;
                second_half = second_half.next;
            }else{
                return 0;
            }

        }
        return res;
    }

    public ListNode findMidElement(ListNode A){

        ListNode slow_ptr = A;
        ListNode fast_ptr = A;

        while(fast_ptr.next != null && fast_ptr.next.next != null){
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }

        return slow_ptr;
    }

    public int lPalin(ListNode A) {
        //Check if it an empty linked list
        if(A == null){
            return 0;
        }
        //If the Linkedlist has only one ListNode
        if(A.next == null){
            return 1;
        }
        //Find the middle element in the list
        ListNode mid = findMidElement(A);

        //Reverse the second half of the list
        ListNode second_half = reverseLinkedList(mid.next);
        
        int res = checkPalindrome(A, second_half);

        return res;
    }

}
