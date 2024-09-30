class CustomStack {
    ArrayList<Integer> stack;
    int capacity;
    int curr_index;
    public CustomStack(int maxSize) {
        capacity = maxSize;
        stack = new ArrayList<Integer>(maxSize);
        curr_index = 0;
    }
    
    public void push(int x) {
        if(curr_index < capacity){
            stack.add(x);
            curr_index++;
        }
    }
    
    public int pop() {
        if(curr_index == 0){
            return -1;
        }
        int result = stack.get(curr_index - 1);
        stack.remove(curr_index - 1);
        curr_index -= 1;
        return result;
    }
    
    public void increment(int k, int val) {
        int i = 0;
        while(i < k && i < curr_index){
            stack.set(i, stack.get(i) + val);
            i++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */