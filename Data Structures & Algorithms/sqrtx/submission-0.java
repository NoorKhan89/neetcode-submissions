class Solution {
    public int mySqrt(int x) {
      int ans =0;

      for(int nums= 1; nums < x; nums = nums +1)
      {
        long val = (long) nums * nums;

        if(val > x)
        {
            break;
        }
        ans = nums;
      }  
      return ans;
    }
}