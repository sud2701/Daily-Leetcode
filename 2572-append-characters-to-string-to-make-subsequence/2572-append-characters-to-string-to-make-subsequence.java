class Solution {
    public int appendCharacters(String s, String t) {
        int n = s.length();
        int m = t.length();
        int curr_index = 0;
        char curr = t.charAt(curr_index);
        int i = 0;
        while(i < n) {
            if(s.charAt(i) == curr){
                curr_index++;
                if(curr_index == m){
                    break;
                }
                curr = t.charAt(curr_index);
            }
            i++;
        }
        return m - curr_index;
    }
}