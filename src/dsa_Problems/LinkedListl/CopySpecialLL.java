package dsa_Problems.LinkedListl;

class RandomListNode {
         int label;
         RandomListNode next, random;
         RandomListNode(int x) { this.label = x; }
    };

public class CopySpecialLL {

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        // Step 1: Insert cloned nodes in between
        RandomListNode tmp = head;
        while (tmp != null) {
            RandomListNode tmp1 = new RandomListNode(tmp.label);
            tmp1.next = tmp.next;
            tmp.next = tmp1;
            tmp = tmp1.next;
        }

        // Step 2: Assign random pointers for cloned nodes
        tmp = head;
        while (tmp != null) {
            RandomListNode tmp1 = tmp.next;
            if (tmp.random != null) {
                tmp1.random = tmp.random.next;
            } else {
                tmp1.random = null;
            }
            tmp = tmp1.next;
        }

        // Step 3: Detach original and copied nodes
        RandomListNode head1 = head.next;
        tmp = head;
        while (tmp != null) {
            RandomListNode tmp1 = tmp.next;
            tmp.next = tmp1.next;
            if (tmp1.next != null) {
                tmp1.next = tmp1.next.next;
            }
            tmp = tmp.next;
        }

        return head1;
}

}
