class Solution {
    public long dividePlayers(int[] skill) {
        int[] freqs = new int[1001];
        int n = skill.length;
        if(n == 2){
            return (long)skill[0] * skill[1];
        }
        long sum = 0;
        for(int i : skill){
            freqs[i]++;
            sum += i;
        }
        if(sum % (n / 2) != 0){
            return -1;
        }
        sum = sum / (n / 2);
        long result = 0;
        for(int i = 1; i <= sum / 2 && i <= 1000; i++){
            if(sum - i > 1000){
                continue;
            }
            if(freqs[i] == freqs[(int)sum - i]){
                if(sum % 2 == 0 && i == sum / 2){
                    if(freqs[i] % 2 == 0){
                        result += (long)(freqs[i] / 2) * i * i;
                    }
                    else {
                        return -1;
                    }
                }
                else {
                    result += (long)freqs[i] * i * (sum - i);
                }
            }
            else {
                return -1;
            }
        }
        return result;
    }
}