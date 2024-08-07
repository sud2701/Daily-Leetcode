class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n <= 1) {
            return n;
        }
        int max_length = 0;
        int curr_length = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        char ch;
        while(i < n) {
            ch = s.charAt(i);
            if(map.get(ch) != null) {
                int j = curr_length;
                char temp;
                while(j > 0) {
                    temp = s.charAt(i - j);
                    map.remove(temp);
                    curr_length -= 1;
                    if(temp == ch){
                        break;
                    }
                    j--;
                }
            }
            map.put(ch, i);
            curr_length += 1;
            i++;
            max_length = Math.max(curr_length, max_length);
        }
        return max_length;
    }
}