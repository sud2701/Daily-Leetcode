class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if(n > h){
            return -1;
        }
        char start = needle.charAt(0);
        int i = 0;
        for(i = 0; i < h; i++){
            if(haystack.charAt(i) == start){
                if(i + n <= h && haystack.substring(i, i + n).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}