class Solution {
    public int pivotIndex(int[] nums) {
      int rightSum =0;
      for(int i=0; i< nums.length; i=i+1)
      {
        rightSum += nums[i];
      }  
      int leftSum =0;
      for(int i=0; i< nums.length; i=i+1)
      {
        if(leftSum == rightSum - nums[i])
        {
            return i;
        }
        leftSum += nums[i];
        rightSum -= nums[i];
      }
      return -1;
    }
}