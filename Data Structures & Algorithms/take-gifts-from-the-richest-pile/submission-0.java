class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
            for(int gift: gifts)
            {
                pq.add(gift);
            }
            for(int i=0; i< k; i++)
            {
                int gift = pq.remove();
                pq.add((int)Math.sqrt(gift));
            }
            long res =0;
            while(!pq.isEmpty())
            {
                res= res+pq.poll();
            }
            return res;       
    }
}