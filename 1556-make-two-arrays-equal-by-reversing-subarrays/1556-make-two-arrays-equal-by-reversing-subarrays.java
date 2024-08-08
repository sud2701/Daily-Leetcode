class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = target.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(n);
        int temp = 0;
        for(int i : target) {
            if(map.get(i) == null) {
                map.put(i, 1);
            }
            else {
                temp = map.get(i);
                map.put(i, temp + 1);
            }
        }
        for(int i: arr) {
            if(map.get(i) == null || map.get(i) == 0) {
                return false;
            }
            else {
                temp = map.get(i);
                map.put(i, temp - 1);
            }
        }
        return true;
    }
}