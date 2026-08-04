class Solution {
    public int maxArea(int[] heights) {
     int left=0;
     int right=heights.length-1;
     int MaxArea=0;
     while(left < right)
     {
        int CWidth = right -left;
        int CHeights =Math.min(heights[left] , heights[right]);
        int Area = CWidth * CHeights;
        MaxArea =Math.max(MaxArea,Area);
        if(heights[left] <  heights[right])
        {
            left ++;
        }
        else
        {
            right++;
        }
     }   
     return MaxArea;
    }
}
