class Solution {
     public double myPowHelper(double x, long n)
     {
        if( n == 1)
        {
            return x;
        }
        if( n == 0)
        {
            return 1;
        }
        if( n < 0)
        {
            n = -1*n;
        
        return 1/myPowHelper(x,n);
        }
        if(n % 2 == 0)
        {
        return myPowHelper(x*x,n/2);
        }
        double temp = myPowHelper(x,n/2);
        return x *temp* temp;
     }
    public double myPow(double x, int n) {
        return myPowHelper(x,(long)n);
    }
}
