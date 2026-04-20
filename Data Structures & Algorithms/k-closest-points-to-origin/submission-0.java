class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Max-Heap: stores [distance, index]. Sorts by distance descending.
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((e1, e2) -> e2[0] - e1[0]);

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1]; // Fixed: was point[0]
            
            // Fixed: correct distance formula x^2 + y^2
            int dist = (x * x) + (y * y);

            maxHeap.add(new int[]{dist, i});
            
            // If heap size exceeds k, remove the furthest point (the max)
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] res = new int[k][2];
        int j = 0;
        while (!maxHeap.isEmpty()) {
            int coordIdx = maxHeap.poll()[1];
            res[j][0] = points[coordIdx][0];
            res[j][1] = points[coordIdx][1];
            j++;
        }
        return res;
    }
}