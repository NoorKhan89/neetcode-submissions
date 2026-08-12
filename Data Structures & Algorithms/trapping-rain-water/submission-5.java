class Solution {
    public int trap(int[] height) {
       int water =0;
       Stack<Integer> stack = new Stack<>();

       for (int i=0; i< height.length; i++)
       {
        while(true)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
                 break;
            }

            int idx = stack.peek();
            if(height[i] > height[idx])
            {
                stack.pop();
            
            if(stack.isEmpty())
            {
                stack.push(i);
                break;
            }
            int leftIdx = stack.peek();
            water = water + (Math.min(height[i], height[leftIdx]) - height[idx])*( i- leftIdx -1);
        }
        else
        {
            stack.push(i);
            break;
        }
        }
       }
       return water;
    }
}