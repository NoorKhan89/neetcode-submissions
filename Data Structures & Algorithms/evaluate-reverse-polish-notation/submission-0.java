class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
       String expStr = "+ - * /";
       for(int i=0; i< tokens.length; i=i+1)
       {
        String token = tokens[i];
        
        if(expStr.contains(token))
        {
            int ops2 = stack.pop();
            int ops1 = stack.pop();
            int val =0;
            
            switch(token)
            {
                case "+":
                val = ops1 + ops2;
                break;

                 case "-":
                val = ops1 - ops2;
                break;
                
                 case "*":
                val = ops1 * ops2;
                break;

                 case "/":
                val = ops1 / ops2;
                break;
            }
            stack.push(val);
        }
        else
        {
            stack.push(Integer.parseInt(token));
        }
       } 
       return stack.peek();
    }
}









