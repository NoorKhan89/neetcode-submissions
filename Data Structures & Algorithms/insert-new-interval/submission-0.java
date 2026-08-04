class Solution {
    public int[][] insert(int[][] intervals, int[] newIntervals) {
      int i=0;
		List<int[]> res = new ArrayList<>();
		
		while (i < intervals.length &&(intervals[i][1] <= newIntervals[0]))
		{
			res.add(intervals[i]);
			i=i+1;
		}		
		while (i< intervals.length && (intervals[i][0] <= 
			newIntervals[1]))
		{
			newIntervals[0] = Math.min(newIntervals[0], intervals[i][0]);
			newIntervals[1] = Math.max(newIntervals[1], intervals[i][1]);
			i = i + 1;
		}
		res.add(newIntervals);
		
		while (i < intervals.length)
		{
			res.add(intervals[i]);
			i=i+1;
		}
			return res.toArray(new int[res.size()][]);

       
       
    }
}
