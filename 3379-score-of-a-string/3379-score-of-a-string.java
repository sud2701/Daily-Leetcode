class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int result = 0;
        for(int i = 0; i < n; i++) {
            if(i + 1 < n){
                result += Math.abs(s.charAt(i) - s.charAt(i + 1));
            }
        }
        return result;
    }
}