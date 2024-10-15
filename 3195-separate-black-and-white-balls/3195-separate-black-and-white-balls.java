class Solution {
    public long minimumSteps(String s) {
        char[] letters = s.toCharArray();
        int n = letters.length;
        int zeroes = 0;
        long result = 0;
        for(int i = n - 1; i >= 0; i--){
            if(letters[i] == '0'){
                zeroes++;
            }
            else {
                result += zeroes;
            }
        }
        return result;
    }
}