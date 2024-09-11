class Solution {
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> xors = new ArrayList<Integer>();
        int result = 0;
        xors.add(0);
        int curr_len = 1;
        int xor = 0;
        for(int i : nums) {
            for(int j = 0; j < curr_len; j++){
                xor = xors.get(j) ^ i;
                xors.add(xor);
                result += xor;
            }
            curr_len *= 2;
        }
        return result;
    }
}