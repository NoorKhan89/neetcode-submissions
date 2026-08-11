class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nsei = new int[heights.length];
        int[] psei = new int[heights.length];
        for(int i=0; i< heights.length; i++)
        {
            nsei[i] = heights.length;
            psei[i] = -1;
        } 
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i< heights.length; i++)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx = stack.peek();
                if(heights[i] < heights[idx])
                {
                    nsei[idx] = i;
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                    break;
                }
            }
        }
        stack.clear();

        for(int i= heights.length -1; i >= 0; i= i-1)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx = stack.peek();
                if(heights[i] < heights[idx])
                {
                    psei[idx] =i;
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                    break;
                }
            }
        }
        int max =0;
        for(int i=0; i< heights.length; i++)
        {
            max = Math.max(max, heights[i] *(nsei[i] - psei[i] - 1));
        }
        return max;
    }
}

