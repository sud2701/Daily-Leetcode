class KthLargest {
    PriorityQueue<Integer> minHeap;
    int size = 0;
    int k = 0;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<Integer>(k, (a, b) -> a - b);
        for(int i: nums) {
            add(i);
        }   
    }
    
    public int add(int val) {
        if(size < k){
            minHeap.add(val);
            size++;
        }
        else if(val > minHeap.peek()){
            minHeap.poll();
            minHeap.add(val);
        }
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */