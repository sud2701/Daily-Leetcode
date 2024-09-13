class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        int n = allowed.length();
        int i = 0;
        int temp_len = 0;
        int result = 0;
        for(i = 0; i < n; i++){
            isAllowed[allowed.charAt(i) - 'a'] = true;
        }
        int m = words.length;
        for(i = 0; i < m; i++){
            temp_len = words[i].length();
            for(int j = 0; j < temp_len; j++){
                if(!isAllowed[words[i].charAt(j) - 'a']){
                    result--;
                    break;
                }
            }
            result++;
        }
        return result;
    }
}