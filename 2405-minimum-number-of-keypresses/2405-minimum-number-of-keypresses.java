class Solution {
    public int minimumKeypresses(String s) {
        Integer[] freqs = new Integer[26];
        char[] letters = s.toCharArray();
        Arrays.fill(freqs, 0);
        for(char ch: letters){
            freqs[ch - 'a'] += 1;
        } 
        Arrays.sort(freqs, Collections.reverseOrder());
        int result = 0;
        for(int i = 0; i < 26; i++){
            if(i <= 8){
                result = result + freqs[i];
            }
            else if(i <= 17){
                result = result + (freqs[i] * 2);
            }
            else {
                result = result + (freqs[i] * 3);
            }
        }
        return result;
    }
}