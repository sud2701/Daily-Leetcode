class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int total = 0;
        for(int i : rolls){
            total += i;
        }
        int result_sum = (mean * (m + n)) - total;
        if(result_sum < n || result_sum > n * 6){
            return new int[] {};
        }
        int[] result = new int[n];
        Arrays.fill(result, result_sum / n);
        result_sum %= n;
        int i = 0;
        while(result_sum > 0){
            result[i] += 1;
            result_sum -= 1;
            i++;
        }
        return result;
    }
}