class Solution {
    public int[] sortedSquares(int[] nums) {
       int N = nums.length;
       int[] result = new int[N];

       for(int i=0; i< N; i=i+1)
       {
        result[i] = nums[i] * nums[i];
       } 
       Arrays.sort(result);
       return result;
    }
}