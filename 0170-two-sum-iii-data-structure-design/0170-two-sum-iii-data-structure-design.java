class TwoSum {
    ArrayList<Integer> stream;
    int curr_numbers;

    public TwoSum() {
        stream = new ArrayList<Integer>();
        curr_numbers = 0;
    }
    
    public void add(int number) {
        int i = 0;
        while(i < curr_numbers){
            if(number >= stream.get(i)){
                i++;
                continue;
            }
            else {
                break;
            }
        }
        if(i == curr_numbers){
            stream.add(number);
        }
        else {
            stream.add(i, number);
        }
        curr_numbers += 1;
    }
    
    public boolean find(int value) {
        int start = 0;
        int end = curr_numbers - 1;
        int first;
        int last;
        while(start < end){
            first = stream.get(start);
            last = stream.get(end);
            if(first + last == value){
                return true;
            }
            else if(first + last < value){
                start += 1;
            }
            else {
                end -= 1;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */