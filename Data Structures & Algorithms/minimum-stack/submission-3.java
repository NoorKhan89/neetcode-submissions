class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {

        stack= new Stack<Integer>();
        minStack = new Stack<Integer>(); 
    }
    
    public void push(int val) {
        
        if(stack.isEmpty())
        {
            stack.push(val);
            minStack.push(val);
            return;
        }
        stack.push(val);
        
        if(val <= minStack.peek())
        {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty())
        {
            return;
        }
        int val = stack.pop();
        if(val == minStack.peek())
        {
            minStack.pop();
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
        return minStack.peek();
    }
}
