class Solution {
    public void BFS(char[][] grid, int r, int c, int[][] dirs)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        grid[r][c] = '0';

        while (!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int cR = curr[0];
            int cC = curr[1];

            for(int[] dir : dirs)
            {
                int nR= cR + dir[0];
                int nC = cC+ dir[1];

                if(nR <0 || nR >= grid.length || nC < 0 || nC >= grid[0].length || grid[nR][nC] == '0')
                {
                    continue;
                }
                grid[nR][nC] ='0';
                queue.add(new int[]{nR,nC});
            }
        }
    }
    public int numIslands(char[][] grid) {
      if(grid == null || grid.length == 0)  return 0;
    
        int countIsands =0;
        int[][] dirs={
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
        };

        for(int i=0; i< grid.length; i++)
        {
            for(int j=0; j< grid[0].length;j++)
            {
                if(grid[i][j] == '1')
                {
                    countIsands ++;
                    BFS(grid, i, j, dirs);
                }
            }
        }
    return countIsands;
    }
}








