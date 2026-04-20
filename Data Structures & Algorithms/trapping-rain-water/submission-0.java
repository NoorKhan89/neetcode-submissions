class Solution {
    public int trap(int[] height) {
        int water =0;
        int left = 1;
        int right = height.length -2;

        int leftMax = height[0];
        int rightMax = height[height.length -1];

        while(left <= right)
        {
            leftMax = Math.max(leftMax, height[left]);

            rightMax = Math.max(rightMax, height[right]);

            if(rightMax < leftMax)
            {
                water = water +(rightMax - height[right]);
                right = right -1;
            }

            else
            {
                 water = water +(leftMax - height[left]);
                left = left +1;
            }
        }
        return water;
    }
}
