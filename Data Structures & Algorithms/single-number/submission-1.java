class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        int sumSet =0;
        for(int num : nums)
        {
            if(!set.contains(num))
            {
                set.add(num);
                sumSet = sumSet + num;
            }
            sum = sum + num;
        }
        return 2 * sumSet - sum;
    }
}
    /*
        int res =0;
        for(int num : nums)
        {
            res = res ^ num;
        }
        return res;
    }
}

*/