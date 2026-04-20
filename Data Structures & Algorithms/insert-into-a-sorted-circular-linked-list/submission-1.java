/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        // head == null
        // node ... circular 
        // node 
        // node != head
        // if n1.val <= n2.val
        // val.. is it in btwn n1 and n2 
        //  insert val beteen n1 and n2 
        // return node with val
        // n1.va > n2.val

        // val >= n1.val
        //  insert val betwn n1 and n2
        // v2 <= n2.val
        //  insert val btwn n1 and n2

        if(head == null)
        {
            Node newNode = new Node(insertVal);
            newNode.next = newNode;
            return newNode;
        }
        Node curr = head;
        
        while(curr.next != head)
        {
            Node next = curr.next;
            if(curr.val <= next.val)
            {
                if(insertVal >= curr.val && insertVal <= next.val)
                {
                    Node newNode = new Node(insertVal);
                    newNode.next = next;
                    curr.next = newNode;
                     return newNode;
                }   
            }
                else
                {
                    if(insertVal >= curr.val || insertVal <= next.val)
                    {
                    Node newNode = new Node(insertVal);
                    newNode.next = next;
                    curr.next = newNode;
                    return newNode;
                    }
                }
                curr = curr.next;
           }
           
                    Node newNode = new Node(insertVal);
                    newNode.next = curr.next;
                    curr.next = newNode;
                    return newNode;
    }
}
      /*

      if(head == null)  // 3 4 1 
      {
        Node node = new Node(insertVal); // 2
        node.next = node;
        return node;
      }  
      Node prev = head;
      Node curr = head.next;

      do
      {
        if( insertVal >= prev.val && insertVal <= curr.val)
        {
            Node node = new Node(insertVal);
            prev.next = node;
            node.next = curr;
            return head;
        }
        else if(prev.val > curr.val)
        {
            if(insertVal >= prev.val)
            {
                Node node = new Node(insertVal);
                prev.next = node;
                node.next = curr;
                return head;
            }

            if(insertVal <= curr.val)
            {
                Node node = new Node(insertVal);
                prev.next = node;
                node.next = curr;
                return head;
            }
        }
         prev = curr;
         curr = curr.next;
      }
      while(prev != head);
     
        Node node = new Node(insertVal);
        prev.next = node;
        node.next= curr;
      
     
        return head;
    }
}

*/
















