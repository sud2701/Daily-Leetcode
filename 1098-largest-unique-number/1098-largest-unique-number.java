class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        boolean found = false;
        for(int i : nums){
            if(map.get(i) != null){
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                result = Math.max(result, i);
                found = true;
            }
        }
        if(!found){
            return -1;
        }
        return result;
    }
}