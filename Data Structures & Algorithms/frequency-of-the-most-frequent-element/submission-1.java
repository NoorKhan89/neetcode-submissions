class Solution {
    public int maxFrequency(int[] nums, int k) {

        int max = 0;
        Arrays.sort(nums);
        long sum = 0;
        int i = 0; 
        int j = 0;

        while(j< nums.length)
        {
            sum = sum + nums[j];

            while((long) nums[j] *(j - i + 1) - sum > k)
            {
                sum = sum -nums[i];
                i = i + 1;
            }
            max = Math.max(max,j-i+1);
            j = j + 1;
        }
        return max;
    }
}
   
   /*  int max = 0;
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
*/