class Solution {
    public int maxArea(int[] heights) {
     int left =0;
     int right = heights.length -1;
     int maxArea =0;
     while(left < right)
     {
        int CHeight = Math.min(heights[left], heights[right]);
        int CWidth = right - left;

        int area = CHeight * CWidth;

        maxArea = Math.max(maxArea, area);

        if(heights[left] < heights[right])
        {
            left ++;
        }
        else
        {
            right --;
        }
     }
     return maxArea;
    }
}
