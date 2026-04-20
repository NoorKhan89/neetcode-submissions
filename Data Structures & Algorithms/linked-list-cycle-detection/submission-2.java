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
    public boolean hasCycle(ListNode head) {
     if(head == null)
     {
      return false;
     }
     ListNode slow = head;
     ListNode fast= head.next;
    
    while(slow != fast)
    {
       if (fast != null || fast.next != null)
     {
      return true;
     }

     slow = slow.next;
     fast =fast.next.next;
    }
    return false;
    }

}
     /*
      Set<ListNode> set = new HashSet<>();
      ListNode curr =head;
      while(curr != null)
      {
        if(set.contains(curr))
        {
            return true;
        }
        set.add(curr);
        curr= curr.next;
      }
      return false;
    }
}
      /*
        Set<ListNode> set= new HashSet<>();
        ListNode curr = head;
        while(curr != null)
        {
            if(set.contains(curr))
            {
                return true;
            }
            set.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
*/
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;

    }
}
