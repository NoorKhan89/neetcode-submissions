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
    public ListNode rotateRight(ListNode head, int k) {
    //
    //  head = [ 0 , 1 , 2 ]--> null    , k = 4
    //
    
      if(k==0)
      {
        return head;
      }
       //          head
      //  head = [ 1 , 2 , 3 , 4 , 5 , 6 ]---> null        , k = 4
      //               head.next
        if(head == null || head.next == null)
        {
          return head;
        }

        // tail = [ 1 , 2 , 3 , 4 , 5 , 6 ]---> null
        // size = 0
        ListNode tail = null;
        int size = 0;
        ListNode curr = head;
        // head
        // curr = [ 1 , 2 , 3 , 4 , 5 , 6 ]---> null
        while( curr != null)
        {
          tail = curr;
          curr = curr.next;
          size++;
          
          // size = 0 , 1 , 2 , 3 , 4 , 5 , 6 , ---> null
        
        }

        int newK = k % size;
        int diff = size - newK;

        if(newK == 0)
        {
          return head;
        } 

        int i=0; 
        curr = head;
        while(i < diff -1)
        {
          curr = curr.next;
          i=i+1;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;
        return newHead;
    }
}












