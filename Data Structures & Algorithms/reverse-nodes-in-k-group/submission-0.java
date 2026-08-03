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
    public ListNode reverseKGroup(ListNode head, int k) {

          int len =0;
        ListNode curr = head;
        // time 0(n)  space 0(1)
        while(curr != null)
        {
            len = len + 1;
            curr = curr.next;
        }

        int time =len / k;
        // 0 -> 1 -> 2 -> 3 -> 4 -> 5
        // d
        //      c                            
        // k = 2;

        curr= head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p1= dummy;
      
        
        for(int i=0; i< time; i=i+1)
        {
            ListNode prev= null;
            ListNode p2 = curr;
            int count =0;

             // 0 -> 1 -> 2 -> 3 -> 4 -> 5
           //   d
          //                   c 
         //     0 -> 2 -> 1 -> 3 -> 4 -> 5
         //       p
         // 1
         //               2
         //                             c
         //      0 -> 2 -> 1 -> 4 -> 3 -> 5
         //                          1
         //                     p

            while(count < k && curr != null)
            {
                count = count + 1;
                //save next
                ListNode next = curr.next;
                //reverse curr node
                 curr.next =prev;
                 prev =curr;
                 curr = next;
            }
            p1.next = prev;
            p2.next = curr;
            p1=p2;
        }
        return dummy.next;
        
    }
}


















