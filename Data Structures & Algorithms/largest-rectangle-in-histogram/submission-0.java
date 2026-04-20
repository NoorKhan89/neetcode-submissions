class Solution {
    public int largestRectangleArea(int[] heights) {
      int[] nesi = new int[heights.length];
      int[] psei = new int[heights.length];

      for(int i = 0; i < heights.length;i = i + 1)
      {
        nesi[i] = heights.length;
        psei[i] = -1;
      }
      Stack<Integer> stack = new Stack<>();
      // next smallest element index 
      for(int i = 0; i < heights.length;i = i + 1)
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
                nesi[idx] = i;
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

      // prev smallset element indx

      for(int i= heights.length -1; i >= 0;i = i - 1)
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
                psei[idx] = i;
                stack.pop();
            }
            else
            {
                stack.push(i);
                break;
            }
        }
      }
      int max= 0;
      for(int i = 0; i < heights.length;i = i + 1)
      {
        max=Math.max(max,heights[i] * (nesi[i] - psei[i] -1));
        
      }
      return max;
    }
}
















