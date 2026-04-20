class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List <int[]> list = new ArrayList<>();
        list.add(intervals[0]);

        for(int i=0; i<intervals.length; i = i + 1)
        {
            int[] prev = list.get(list.size() -1);
            int[] curr = intervals[i];

            if(curr[0] <= prev[1])
            {
                prev[0] = Math.min(prev[0], curr[0]);
                prev[1] = Math.max(prev[1], curr[1]);
            }
            else
            {
                list.add(intervals[i]);
            }
        }
        int[][] res = new int[list.size()][2];

        for(int i=0; i < list.size(); i=i+1)
        {
            res[i] = list.get(i);
        }
        return res;
    }
}

      /* 
       Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List <int[]> list = new ArrayList<>();
        list.add(intervals[0]);

        for(int i=0; i < intervals.length; i=i+1)
        {
            int[] prev= list.get(list.size()-1);
            int[] curr= intervals[i];
            
            if(curr[0] <=prev[1])
            {
                prev[0] = Math.min(prev[0] , curr[0]);
                prev[1] = Math.max(prev[1] , curr[1]);
            }
            else
            {
                list.add(intervals[i]);
            }
        } 
        int[][] res = new int[list.size()][2];

        for(int i=0; i < list.size();i=i+1)
        {
            res[i] = list.get(i);
        }
        return res;
    }
}

*
        public boolean isOverlap(int[] int1, int[] int2)
    {
        return int1[1] >= int2[0] && int2[1] >= int1[0];
    }
    public int[][] merge(int[][] intervals) {
      List<int[]> list= new ArrayList<>();  
      for(int[] interval : intervals)
      {
        list.add(interval);
      }

      boolean isMergeHappened = true;
      while(isMergeHappened)
      {
        isMergeHappened = false;

        for( int i=0;i<list.size();i=i+1)
        {
            int j=i+1;

            while( j< list.size())
            {
                int[] int1 = list.get(i);
                int[] int2 = list.get(j);

                if(isOverlap(int1,int2))
                {
                    int1[0] = Math.min(int1[0], int2[0]);
                    int2[1] = Math.max(int1[1], int2[1]);

                     
                    //  prev[0] = Math.min(prev[0] , curr[0]);
                     // prev[1] = Math.max(prev[1] , curr[1]);

                    list.remove(j);
                    isMergeHappened = true;
                }
                else
                {
                    j=j+1;
                }
            }
        }
      }
            int[][] res= new int[list.size()][2];
            for(int i=0; i<list.size(); i=i+1)
            {
                res[i]=list.get(i);
            }
            return res;
    }
}
*/


