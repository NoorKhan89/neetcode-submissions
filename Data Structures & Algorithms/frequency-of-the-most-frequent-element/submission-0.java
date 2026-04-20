class Solution {
    public int maxFrequency(int[] nums, int k) {
     int max = 0;
     Arrays.sort(nums);

     for(int i = 0; i < nums.length; i = i + 1)
     {
        int sum = 0;

        for (int j = i ; j < nums.length; j = j + 1)
        {
            sum = sum + nums[j];

            if(nums[j] *(j - i + 1) - sum >k)
            {
                break;
            }
            max= Math.max(max, j- i + 1);
        }
     }   
     return max;
    }
}