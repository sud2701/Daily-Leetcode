class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            count = 0;
            for(int j = 0; j < n; j++){
                if(boxes.charAt(j) == '1'){
                    count += Math.abs(i - j);
                }
            }
            res[i] = count;
        }
        return res;
    }
}