class Solution {
    public int minimumPushes(String word) {
        int[] frequency = new int[26];
        boolean[] visited = new boolean[26];
        int n = word.length();
        char ch;
        int multiplier = 1;
        int curr_elements = 0;
        int max_index = -1;
        int max_freq = 0;
        int result = 0;
        int i = 0;
        for(i = 0; i < n; i++) {
            ch = word.charAt(i);
            frequency[ch - 'a']++;
        }
        while(true) {
            max_freq = 0;
            max_index = -1;
            for(i = 0; i < 26; i++){
                if(!visited[i] && frequency[i] > max_freq) {
                    max_freq = frequency[i];
                    max_index = i;
                }
            }
            if(max_index == -1){
                break;
            }
            result += (frequency[max_index] * multiplier);
            visited[max_index] = true;
            curr_elements += 1;
            if(curr_elements == 8) {
                multiplier += 1;
                curr_elements = 0;
            }
        }
        return result;
    }
}