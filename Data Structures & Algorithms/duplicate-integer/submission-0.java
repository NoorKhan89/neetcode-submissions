class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length-1)
        {
            if(nums[i] == nums[i+1])
            {
                return true;
            }
            i=i+1;
        }
        return false;
    }
}