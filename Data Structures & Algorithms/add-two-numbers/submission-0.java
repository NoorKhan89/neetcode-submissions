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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     // 4.-> 5. -> 6. ->(null) 
       ListNode DHead = new ListNode(0); // _ -> _ -> _ -> _ -> _ -> _ -> _
       ListNode curr = DHead;           // _c -> _c -> _c -> _c -> _c -> _c -> _c
       int carry=0; 
       while(l1 != null || l2 != null || carry != 0)
        // 1.-> 2. -> 3. ->(null)
        // 4.-> 5. -> 6. ->(null)
       {
        int a=(l1 != null)? l1.val :0;  // 1.-> 2. -> 3. ->(carry (0))
        int b=(l2 != null)? l2.val :0; // 4.-> 5. -> 6. ->(carry (0))

        int sum = carry +a+b;
       carry =sum/10;
       curr.next =new ListNode (sum %10); 
       curr=curr.next;

       if(l1 != null)  // 1.-> 2. -> 3. ->(null)
       {
        l1= l1.next;
       }
       if (l2 != null) // 4.-> 5. -> 6. ->(null)
       {
        l2= l2.next;  
       }
       }
       return DHead.next;
    }
}



















