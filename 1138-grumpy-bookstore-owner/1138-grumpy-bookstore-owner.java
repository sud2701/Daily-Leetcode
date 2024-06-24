class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max_diff = 0;
        int n = grumpy.length;
        int result = 0;
        int temp_diff = 0;
        for(int i = 0; i < n - minutes + 1; i++) {
            if(i == 0) {
                for(int j = 0; j < minutes; j++) {
                    if(grumpy[j] == 0){
                        result += customers[j];
                    }
                    else {
                        temp_diff += customers[j];
                    }
                }
            }
            else {
                if(grumpy[i - 1] == 1){
                    temp_diff -= customers[i - 1];
                }
                if(grumpy[i + minutes - 1] == 1){
                    temp_diff += customers[i + minutes - 1];
                }
                else {
                    result += customers[i + minutes - 1];
                }
            }
            max_diff = Math.max(max_diff, temp_diff);
        }

        return result + max_diff;
    }
}