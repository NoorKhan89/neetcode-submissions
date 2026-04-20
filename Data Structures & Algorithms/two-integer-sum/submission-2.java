
class Solution {
    public int[] twoSum(int[] nums, int target) {

  for(int i=0;i<nums.length; i=i+1)
     {
        for(int j=i+1; j< nums.length; j=j+1)
        {
            if(nums[i] == target - nums[j])
            {
                return new int[]{i,j};
            }
        }
     }
     return null;
     
    }
}

      
      /*
      for(int i=0; i< nums.length; i=i+1)
      {
        for(int j=i+1; j< nums.length; j=j+1)
        {
          if(nums[i] + nums[j] == target)
          {
            return new int[]{i,j};
          }
        }
      }
      return new int[]{};
    }
}

     
     *
      int i=0;
      int j= nums.length -1;

      while(i < j)
      {
        int sum = nums[i] + nums[j];

        if(sum == target)
        {
          return new int[]{i+1, j+1};
        }
        else if(sum < target)
        {
          i=i+1;
        }
        else
        {
          j= j-1;
        }
      }
       return new int[]{};
    }
}
    *
      Map <Integer,Integer> map = new HashMap<>();
      for( int i=0;i<nums.length;i++)
      {
        int LookingFor =target - nums[i];
      
        if(map.containsKey(LookingFor))
        {
            return new int []
            {
                map.get(LookingFor),i
            };
        }
             map.put(nums[i],i);
       }
      return new int[0];
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map <Integer,Integer> map = new HashMap<>();
      for( int i=0;i<nums.length;i++)
      {
        int LookingFor = target - nums[i];
      
        if(map.containsKey(LookingFor))
        {
            // --- MODIFIED LINE ---
            // Put map.get(LookingFor) (the smaller index 0) first,
            // and the current index i (the larger index 1) second.
            return new int []
            {
                map.get(LookingFor), i 
            };
        }
              map.put(nums[i], i);
        }
      return new int[0]; // Should not be reached based on problem constraints
    }
} 
*/