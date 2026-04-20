
class Solution {
    public int[] twoSum(int[] nums, int target) {
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
/*
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