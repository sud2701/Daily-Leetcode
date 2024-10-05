class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] perm_freq = new int[26];
        int[] temp_freq = new int[26];
        int n = s1.length();
        int m = s2.length();
        int x = 0;
        if(m < n){
            return false;
        }
        int i = 0;
        while(i < n){
            perm_freq[s1.charAt(i) - 'a']++;
            temp_freq[s2.charAt(i) - 'a']++;
            i++;
        }
        i = 0;
        while(i <= m - n){
            for(x = 0; x < 26; x++){
                if(perm_freq[x] == temp_freq[x]){
                    if(x == 25){
                        return true;
                    }
                }
                else {
                    break;
                }
            }
            temp_freq[s2.charAt(i) - 'a']--;
            if(i != (m - n)){
                temp_freq[s2.charAt(i + n) - 'a']++;
            }
            i++;
        }
        return false;
    }
}