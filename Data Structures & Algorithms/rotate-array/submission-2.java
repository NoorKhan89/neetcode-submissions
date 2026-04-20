class Solution {
    public void reverse(int[]nums, int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
    public void rotate(int[] nums, int k) {
       k =k % nums.length;
       reverse(nums, 0, nums.length -1);
       reverse(nums,0,k-1);
       reverse(nums,k,nums.length-1);
    }
}
       /*
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
