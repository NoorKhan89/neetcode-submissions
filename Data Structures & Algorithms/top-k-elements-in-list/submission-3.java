class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    for(int num: nums)
    {
        map.put(num,map.getOrDefault(num, 0) +1);
    }    
    PriorityQueue<Integer> pq = new PriorityQueue<>((e1, e2)-> map.get(e1) - map.get(e2));

    for(int num : map.keySet())
    {
        pq.add(num);

        if(pq.size() > k)
        {
            pq.poll();
        }
    }
        int[] res = new int[k];

        for(int i=0; i<k; i++)
        {
            res[i] = pq.poll();
        }
    
    return res;
    }
}
