class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
         int[]arr= new int[nums.length];
         for(int i=0; i< nums.length;i=i+1)
         {
            arr[(i + k) % nums.length]= nums[i];
         }
         for(int i=0; i< nums.length; i=i+1)
         {
            nums[i] = arr[i];
         }
    }
}
     /*
        k = k% nums.length;
        int[] arr= new int[nums.length];
        for(int i=0; i< nums.length; i=i+1)
        {
            arr[(i+k) % nums.length] = nums[i];
        }

        for(int i=0; i< nums.length;i=i+1)
        {
            nums[i] = arr[i];
        }
    }
}
*/
