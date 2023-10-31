class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer> ();
        int count = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(freq.containsKey(nums[i])){
                temp = freq.get(nums[i]);
                freq.put(nums[i], temp + 1);
            }
            else {
                freq.put(nums[i], 1);
            }
        }
        for(int i : freq.keySet()){
            temp = freq.get(i);
            if(temp <= 1){
                continue;
            }
            else {
                count += (temp * (temp - 1)) / 2;
            }
        }
        return count;
    }
}