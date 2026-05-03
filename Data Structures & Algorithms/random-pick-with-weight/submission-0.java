class Solution {
    int[] pSums;
    public Solution(int[] w) {
        pSums= new int[w.length];
        pSums[0] = w[0];
        
        for(int i=1; i< w.length; i=i+1)
        {
            pSums[i] = pSums[i - 1] + w[i];
        }
    }
    public int pickIndex() {
     double rand = Math.random();
     double target = rand * pSums[pSums.length -1];

     for(int i=0; i < pSums.length; i=i+1)
     {
        if(target <= pSums[i])
        {
            return i;
        }
     }   
     return 0;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */