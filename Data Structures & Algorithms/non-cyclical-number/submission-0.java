class Solution {
    public int SumOfSquareOfDigit(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int dig = n % 10;
              n = n/10;
            sum = sum +(dig * dig);
          
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(true)
        {
            slow = SumOfSquareOfDigit(slow);
            fast = SumOfSquareOfDigit(SumOfSquareOfDigit(fast));
        
        if(fast == 1)
        {
            return true;
        }
        if(slow == fast)
        {
            return false;
       
        }
        }
    }
}
