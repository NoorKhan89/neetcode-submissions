class Solution {
    public void sortColors(int[] nums) {
		int i=0; int j=nums.length-1;
		int k=0;
		//		Input: nums = [2, 0, 2, 1, 1, 0]
		while (k < j)
		{
			if(nums[k] ==0)
			{
		else if (nums[k] > 0)
			{
				k=k+1;
			}
			}
			else if (nums[k] == 2)
			{
				int temp = nums[j];
				nums[j] = nums[k];
				nums[k] = temp;
				j=j-1;
			}
			else
			{
				int temp = nums[i];
				nums[i] = nums[k];
				nums[k] = temp;
				i=i+1;
				k=k+1;
			}
		}
	}
  }