class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
      
      PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->{
        if(a[0] != b[0])
        {
            return a[0] - b[0];
        }
        return a[1] - b[1];
      });

      for(int i=0; i< nums.length; i=i+1)
      {
        pq.add(new int[]{
            nums[i],
            i
        });
      }

      for(int i=0; i< k; i=i+1)
      {
        int[] ele = pq.remove();
        int val = ele[0];
        int idx = ele[1];

        int valToAdd = val * multiplier;
        pq.add(new int[]{
            valToAdd, 
            idx
        });
        nums[idx]= valToAdd;
      }
      return nums;
    }
}

























