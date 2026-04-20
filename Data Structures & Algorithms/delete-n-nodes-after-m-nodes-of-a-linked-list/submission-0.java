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
    public ListNode deleteNodes(ListNode head, int m, int n) {
     ListNode curr = head;
     while(curr != null)
     {
        int counter =0;
        ListNode prev = null;

        while(counter < m && curr != null)
        {
            counter = counter +1;
            prev = curr;
            curr= curr.next;
        }
        counter =0;
        while(counter < n && curr != null)
        {
            counter = counter + 1;
            curr = curr.next;
        }
        prev.next = curr;
     }  
     return head; 
    }
    
}
