class MovingAverage {
    Queue<Integer> queue;
    int maxSize;
    int runningSum;
    public MovingAverage(int size) {
        queue = new LinkedList<Integer>();
        maxSize = size;
        runningSum =0;
    }
    
    public double next(int val) {
        if(queue.size() == maxSize)
        {
            runningSum = runningSum - queue.poll();
        }
        // 1 10 3

        runningSum = runningSum + val;

        queue.offer(val);
        double result= runningSum * 1.0 / Math.min(queue.size(), maxSize);
        return result;
    }
}

