class Node
{
    int val;
    Node next;
    public Node(int val, Node next)
    {
        this.val = val;
        this.next = next;
    }
}
class MyCircularQueue {
    Node head;
    Node tail;
    int count;
    int maxSize;
    public MyCircularQueue(int k) {
        count =0;
        maxSize = k;
        head = null;
        tail = null;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }
        Node node = new Node(value, null);
        if(count == 0)
        {
            head =node;
            tail = node;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
        count = count +1;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
        {
            return false;
        }
        head = head.next;
        count = count -1;

        return true;
    }
    
    public int Front() {
        if(isEmpty())
        {
            return -1;
        }
        return head.val;
    }
    
    public int Rear() {
        if(isEmpty())
        {
            return -1;
        }
        return tail.val;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == maxSize;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */