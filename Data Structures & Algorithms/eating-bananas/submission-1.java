class Solution {
   public boolean isPossible(int[] piles, int speed, int hours)
    {
        long totalHours =0;

        for(int pile: piles)
        {
            totalHours = totalHours +(int)Math.ceil((double)pile/ speed);
        }
        return totalHours <= hours;
    }
    public int minEatingSpeed(int[] piles, int h) {

        // 11 bananas 
        // 4 bananas per hour 
        // 4
        // 7
        // 3
        // 3 hours
        int min =1;
        int max = Integer.MIN_VALUE;

        for(int pile : piles)
        {
            max = Math.max(pile, max);
        }
      int low= min;
      int high= max;

      while(low < high)
      {
        int mid = low+(high - low) /2 ;

         if(isPossible(piles, mid, h))
            {
                high  = mid;
            }
            else
            {
                low = mid +1;
            }
      }
        return low;
    }
}
