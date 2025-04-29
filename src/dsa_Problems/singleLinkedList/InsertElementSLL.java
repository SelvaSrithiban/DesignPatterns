package dsa_Problems.singleLinkedList;

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class InsertElementSLL {

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

     // Helper method to print the list
     public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static int getListSize(ListNode head){

        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        return size;
    }

    public static void getMid(ListNode head, int size){
        //System.out.println("Printing statement");
        ListNode tmp = head;
        int n = (size+1)/2;

        for(int i = 1; i < n; i++){
            tmp = tmp.next;
        }

        System.out.println("The middle element is " + tmp.val);

    }

    public static void getMidElement(ListNode head, int size){
        //System.out.println("Printing statement");
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("The middle element is " + slow.val);

    }

    public static void main(String[] args) {

        //InsertElementSLL obj = new InsertElementSLL();

        int[] inputArray = {1, 2, 3, 4, 5, 6 , 7, 8};

        ListNode head = createLinkedList(inputArray);

        //printList(head);
        int size = getListSize(head);

        getMidElement(head, size);

        /*// Create initial list: 1 -> 2 -> 3 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        // Insert value 10 at position 1 (between 1 and 2)
        head = obj.solve(head, 10, 1);

        System.out.println("After inserting 10 at position 1:");
        printList(head);

        // Insert value 99 at position 10 (out of bounds, should insert at end)
        head = obj.solve(head, 99, 10);

        System.out.println("After inserting 99 at position 10:");
        printList(head);*/
        
    }

}
