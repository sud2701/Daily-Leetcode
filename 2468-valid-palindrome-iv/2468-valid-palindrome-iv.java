class Solution {
    public boolean makePalindrome(String s) {
        int count = 0;
        char[] letters = s.toCharArray();
        int n = letters.length;
        if(n == 0){
            return false;
        }
        int start = 0;
        int end = n - 1;
        while(start < end){
            if(letters[start] != letters[end]){
                count++;
                if(count > 2){
                    break;
                }
            }
            start++;
            end--;
        }
        if(count == 0 && n > 0){
            return true;
        }
        return (count == 1 || count == 2);
    }
}