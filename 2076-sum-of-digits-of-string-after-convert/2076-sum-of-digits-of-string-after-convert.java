class Solution {
    public int getLucky(String s, int k) {
        int n = s.length();
        int total = 0;
        int i = 0;
        for(i = 0; i < n; i++){
            total += sumOfDigits(s.charAt(i) - 'a' + 1);
        }
        for(i = 1; i < k; i++){
            total = sumOfDigits(total);
        }
        return total;
    }
    public int sumOfDigits(int N){
        int result = 0;
        while(N > 0){
            result += (N % 10);
            N /= 10;
        }
        return result;
    }
}