class Solution {
    public int removeElement(int[] nums, int val) {
      int n = nums.length;
      int i=0;
      while(i<n)
      {
        if(nums[i] == val)
        {
          nums[i] = nums[n -1];
          n--;
        }
        else
        {
          i++;
        }
      }
      return n;
    }
}
      /*
      int i=0;
      for(int j=0; j < nums.length; j=j+1)
      {
        if(nums[j] != val)
        {
            nums[i] = nums[j];
            i++;
        }
      }  
      return i;
    }
}
*/
