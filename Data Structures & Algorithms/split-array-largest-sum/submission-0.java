class Solution {
    public int countSplits(int[] nums, int val)
    {
        int splits = 0;
        int subArrSum =0;
        for(int i=0; i< nums.length; i=i+1)
        {
            subArrSum = subArrSum + nums[i];

            if(subArrSum > val)
            {
                splits = splits+ 1;
                subArrSum = nums[i];
            }
        }
        return  splits+1;
    }
    public int splitArray(int[] nums, int k) {
      int minVal = Integer.MIN_VALUE;
      int maxVal =0;
      

      for(int numI : nums)
      {
        minVal = Math.max(minVal, numI);
        maxVal = maxVal + numI;
      }  

      int low = minVal;
      int high = maxVal;
     while(low < high)
      {
        int mid = low + (high - low) /2;
        int subArrCount = countSplits(nums, mid);

        if(subArrCount <= k)
        {
           high = mid;;
        }
        else
        {
            low = mid +1;
        }
      }
      return low;
    }
}

/*
 // --------------- Appraoch (1) --------------------- //

class Solution {
    public int countSplits(int[] nums, int val)
    {
        int splits = 0;
        int subArrSum =0;
        for(int i=0; i< nums.length; i=i+1)
        {
            subArrSum = subArrSum + nums[i];

            if(subArrSum > val)
            {
                splits = splits+ 1;
                subArrSum = nums[i];
            }
        }
        return  splits+1;
    }
    public int splitArray(int[] nums, int k) {
      int minVal = Integer.MIN_VALUE;
      int maxVal =0;


      for(int numI : nums)
      {
        minVal = Math.max(minVal, numI);
        maxVal = maxVal + numI;
      }  
      for(int val = minVal; val <= maxVal; val = val +1)
      {
        int subArrCount = countSplits(nums, val);

        if(subArrCount <= k)
        {
            return val;
        }
      }
      return -1;
    }
}


 */