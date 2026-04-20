class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0; i<nums.length;i=i+1)  //2,1,5,1,5,3 
        {    
            sum=0;                              // target = 10
            for(int j=i; j<nums.length; j=j+1)
            {
                sum =sum+nums[j];
                if(sum >= target)
                {
                    size=Math.min(size,j-i+1);
                    break;
                }
            }
        }
        return size == Integer.MAX_VALUE ? 0: size;
    }
}