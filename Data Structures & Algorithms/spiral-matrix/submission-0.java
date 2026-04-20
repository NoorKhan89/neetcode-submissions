class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;

        int i = 0; 
        int j = -1;
        int dir = 1;
        int m = matrix.length;    // Rows
        int n = matrix[0].length; // Columns

        while (m > 0 && n > 0) {
            // 1. Move Horizontally
            for (int k = 0; k < n; k++) {
                j += dir;
                res.add(matrix[i][j]);
            }
            m--; // One row is now finished

            // 2. Check if we still have rows left to move vertically
            if (m == 0) break; 

            // 3. Move Vertically
            for (int k = 0; k < m; k++) {
                i += dir;
                res.add(matrix[i][j]);
            }
            n--; // One column is now finished

            // 4. Flip direction for the next "turn"
            dir *= -1;
        }
        return res;
    }
}