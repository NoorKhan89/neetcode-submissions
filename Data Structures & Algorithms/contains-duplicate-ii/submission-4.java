class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

          Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i=i+1)
        {
            if(map.containsKey(nums[i]))
            {
                
                int diff= i- map.get(nums[i]);
                if(diff <= k)
                {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

        /*
			Set<Integer> set = new HashSet<>();
			
				for (int i=0; i< nums.length; i=i+1)
		{
               if (i> k)
               {
                set.remove(nums[i-k-1]);
                }

				if (set.contains(nums[i]))
				{
					return true;
				}
				set.add(nums[i]);
			
		}
		return false;
		
	 }
}

*
        Set<Integer> set = new HashSet<>();
        for(int i=0; i < nums.length; i=i+1)
        {
            if(i > k)
            {
                set.remove(nums[i - k - 1]);
            }
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }   

        return false;
    }
}
*/