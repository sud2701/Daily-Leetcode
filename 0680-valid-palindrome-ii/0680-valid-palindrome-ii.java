class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n - 1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start ++;
                end --;
            }
            else {
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int start, int end){
        int i = start;
        int j = end;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i ++;
                j --;
            }
            else {
                return false;
            }
        }
        return true;
    }
}