class MovingAverage {
    private Queue<Integer> queue;
    private int currentSize;
    private double average;
    private int capacity;
    public MovingAverage(int size) {
        queue = new LinkedList<Integer>();
        currentSize = 0;
        capacity = size;
    }
    
    public double next(int val) {
        if(currentSize < capacity){
            queue.add(val);
            average = (double)((average * currentSize) + val) / (currentSize + 1);
            currentSize += 1;
        }
        else {
            average = (double)((average * currentSize) + val - queue.remove()) / currentSize;
            queue.add(val);
        }
        return average;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */