class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n : nums1)
        {
            set1.add(n);
        }

        for(int n : nums2)
        {
            set2.add(n);
        }
        set1.retainAll(set2);
        int[] res = new int[set1.size()];
        int i=0;

        for(int num: set1)
        {
            res[i] = num;
            i++;
        }
        return res;
    }
}
      /*
        Map<Integer,Integer> map = new HashMap<>();

        for(int n: nums1)
        {
            map.put(n,1);
        }
            List<Integer> ans = new ArrayList<>();
            for(int n :nums2)
            {
                if(map.containsKey(n) && map.get(n) == 1)
                {
                    map.put(n,0);
                    ans.add(n);
                }
            } 
            int[] res = new int[ans.size()];
            for(int i=0; i< ans.size(); i=i+1)
            {
                res[i] = ans.get(i);
            }
            return res;
    }
}

*/
