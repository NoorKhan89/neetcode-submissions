class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for(int i=0; i < n; i=i+1)
        {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }
        
        for(int r = 0; r < board.length ; r = r + 1)
        {
            for(int c = 0; c < board[0].length;c = c + 1)
            {
                char cell= board[r][c];

                if(cell == '.')
                {
                    continue;
                }

                if(rows[r].contains(cell))
                return false;
                rows[r].add(cell);

                if(cols[c].contains(cell))
                return false;

                cols[c].add(cell);

                int boxesIndex = 3*(r/3)+(c/3);

                if(boxes[boxesIndex].contains(cell))
                {
                    return false;
                }
                boxes[boxesIndex].add(cell);
            }
        }
        return true;
    }
}







