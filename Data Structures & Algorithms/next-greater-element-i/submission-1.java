class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums2.length; i++)
        {
            map.put(nums2[i], i);
        }
        int[] res= new int[ nums2.length];
        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< nums2.length; i++)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
                continue;
            }
            int val = nums2[i];

            while(!stack.isEmpty() && val > nums2[stack.peek()])
            {
                int idx= stack.pop();
                res[idx] =val;
            }
            stack.push(i);
        }
            int[] out = new int[nums1.length];
            for(int i=0; i< nums1.length; i++)
            {
            if(map.containsKey(nums1[i]))
            {
                 out[i] = res[map.get(nums1[i])];
            }
            else
            {
                out[i] = -1;
            }
          }
        return out;
    }
}