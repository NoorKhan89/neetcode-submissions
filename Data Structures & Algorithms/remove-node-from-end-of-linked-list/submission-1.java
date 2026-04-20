/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode PHead = new ListNode(0);
        PHead.next = head;

        ListNode curr = PHead;
        ListNode temp = PHead;
        int i=0;
        while(i <= n)
        {
            curr = curr.next;
            i = i+1;
        }
        while(curr != null)
        {
            curr= curr.next;
            temp= temp.next;
        }
        temp.next = temp.next.next;
        return PHead.next;
    }
}

      
      /*
        ListNode PHead = new ListNode(0);
        PHead.next=head;
        ListNode curr = PHead; 
        ListNode temp = PHead;
        int i=0;
        while(i<= n)
        {
            curr=curr.next;
            i++;

        }
        while(curr != null)
        {
            curr= curr.next;
            temp = temp.next;
        }
            temp.next= temp.next.next;
        return PHead.next;
}
}

*/