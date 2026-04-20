
class MinStack {
Stack<Integer> stack;
Stack<Integer>minstack;
    public MinStack() {
        stack = new Stack<Integer>();
        minstack = new Stack<Integer>(); 
    }
    
    public void push(int val) {
        if(stack.isEmpty())
        {
            stack.push(val);
            minstack.push(val);
            return;
        }
        stack.push(val);

        if(val <= minstack.peek())
        {
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty())
        {
            return;
        }
        int val = stack.pop();
        if(val == minstack.peek())
        {
            minstack.pop();
        }
    }
    
    public int top() {
        if(stack.isEmpty())
        {
            return -1;
        }
        return stack.peek();
    }
    
    public int getMin() {
        if(stack.isEmpty())
        {
            return -1;
        }
        return minstack.peek();
    }
}




/*
class Node
{
    int val;
    int min;

    public Node(int v, int m)
    {
        this.val = v;
        this.min = m;
    }
}

class MinStack 
{
    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<Node>();
    }
    
    public void push(int val) {
        if(stack.isEmpty())
        {
            stack.push(new Node(val,val));
            return;
        }

        Node nodeTop = stack.peek();
        int minTop = nodeTop.min;

        if(val < minTop)
        {
            stack.push(new Node(val,val));
        }
        else
        {
            stack.push(new Node(val,minTop));
        }
    }
    
    public void pop() {
        if(stack.isEmpty())
        {
            return;
        }
        stack.pop();
    }
    
    public int top() {
     if(stack.isEmpty())
     {
        return -1;
     }   
     Node nodeTop = stack.peek();
     return nodeTop.val;
    }
    
    public int getMin() {
        if(stack.isEmpty())
        {
            return -1;
        }
        Node nodeTop = stack.peek();
        return nodeTop.min;
    }
}

*/
