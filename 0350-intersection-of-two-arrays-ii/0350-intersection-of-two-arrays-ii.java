class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i : nums1){
            if(map.get(i) == null){
                map.put(i, 1);
            }
            else {
                map.put(i, map.get(i) + 1);
            }
        }
        for(int i : nums2){
            if(map.get(i) == null){
                continue;
            }
            else {
                if(map.get(i) == 1){
                    map.remove(i);
                }
                else {
                    map.put(i, map.get(i) - 1);
                }
                result.add(i);
            }
        }
        int[] final_result = new int[result.size()];
        int index = 0; 
        for(int i : result){
            final_result[index] = i;
            index++;
        }
        return final_result;
    }
}