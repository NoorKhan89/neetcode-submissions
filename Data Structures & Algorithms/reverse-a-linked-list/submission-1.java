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
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while(curr != null)
       {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       return prev;
    }
}

       /*
        ListNode PHead = new ListNode(0);
        PHead.next= head;
        ListNode curr= PHead;
        ListNode temp= PHead;
        int i=0;
        int n=0;
        while(i<=n)
        {
            curr=curr.next;
            i++;
        }
            while( curr != null)
            {
                curr=curr.next;
                temp= temp.next;
                temp.next= temp.next.next;
            }
            return PHead.next;
    }
}
    /*
     ListNode prev =null;
     ListNode curr =head;
     while(curr != null)
     {
        ListNode temp= curr.next;
        curr.next= prev;
        prev= curr;
        curr=temp;
     }   
     return prev;
    }
}

*/