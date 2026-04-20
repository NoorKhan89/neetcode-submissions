/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     
      ListNode l1= list1;
      // L1     1 - 2 - 4   -> null
      ListNode l2= list2;
      // L2     1 - 3 - 5   -> null
      ListNode l3= new ListNode (0);
      // L3        _  -  _ - _  -> null
      ListNode PHead =l3;
      while(l1 != null && l2 != null)
      {
  // L1   1 - 2 - 4   -> null
  // L2   1 - 3 - 5   -> null

        if(l1.val < l2.val)
        {
            l3.next = l1;
            // 1 - 
            l1= l1.next;
        }
        else
        {
            l3.next=l2;
            l2=l2.next;
        }
            l3=l3.next;
      }
            l3.next = l1 == null ? l2 : l1; 
            return PHead.next;
    }
}

*/

class Solution
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode l3 = new ListNode(0);

        ListNode Phead = l3;
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                l3.next =l1;
                l1 = l1.next;
            }
            else
            {
                l3.next = l2;
                l2 = l2.next;
            }
                l3 = l3.next;
        }
                l3.next = l1 == null ? l2 : l1;
                return Phead.next;
    }
}














