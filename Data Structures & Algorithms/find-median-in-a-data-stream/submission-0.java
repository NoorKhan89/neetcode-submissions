class MedianFinder {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer>minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        minHeap = new PriorityQueue<Integer>();

    }
    
    public void addNum(int num) {
        
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());

        if(minHeap.size() > maxHeap.size())
        {
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() 
    {
        if(maxHeap.size() == minHeap.size())
        {
            return (maxHeap.peek() + minHeap.peek())/2.0;
        }    
        return maxHeap.peek();
    }
}









