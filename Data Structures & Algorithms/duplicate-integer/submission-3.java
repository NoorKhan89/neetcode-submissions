class Solution {
    public boolean hasDuplicate(int[] nums) {

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
        for(int num : nums)
        {
            if(set.contains(num))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
*/