class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max_diff = 0;
        int n = grumpy.length;
        int result = 0;
        int temp_diff = 0;
        for(int i = 0; i < minutes; i++){
            if(grumpy[i] == 0){
                result += customers[i];
            }
            else {
                temp_diff += customers[i];
            }
        }
        max_diff = temp_diff;
        for(int i = 1; i < n - minutes + 1; i++) {
                if(grumpy[i - 1] == 1){
                    temp_diff -= customers[i - 1];
                }
                if(grumpy[i + minutes - 1] == 1){
                    temp_diff += customers[i + minutes - 1];
                }
                else {
                    result += customers[i + minutes - 1];
                }
            max_diff = Math.max(max_diff, temp_diff);
        }
        return result + max_diff;
    }
}