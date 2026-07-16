class Solution {
    public int heightChecker(int[] heights) {
        int counter =0;
        Integer[] res = new Integer[heights.length];
        for(int i=0; i< heights.length; i++)
        {
            res[i] = heights[i];
        }
        Arrays.sort(res);

        for(int i=0; i<heights.length; i++)
        {
            if(heights[i]!= res[i])
            {
                counter ++;
            }
        }
        return counter++;
    }
}