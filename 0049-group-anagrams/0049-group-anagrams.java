class Solution {
    int n1;
    int n2;
    int[] freqs;
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        ArrayList<String> parents = new ArrayList<String>();
        parents.add(strs[0]);
        int curr_parents = 1;
        List<List<String>> result = new ArrayList<List<String>>();
        result.add(new ArrayList<String>());
        result.get(0).add(strs[0]);
        boolean isAnagramed = false;
        int j = 0;
        for(int i = 1; i < n; i++){
            isAnagramed = false;
            for(j = 0; j < curr_parents; j++){
                if(checkAnagrams(parents.get(j), strs[i])){
                    result.get(j).add(strs[i]);
                    isAnagramed = true;
                    break;
                }
            }
            if(!isAnagramed){
                result.add(new ArrayList<String>());
                result.get(curr_parents).add(strs[i]);
                parents.add(strs[i]);
                curr_parents += 1;
            }
        }
        return result;
    }

    public boolean checkAnagrams(String s1, String s2) {
        n1 = s1.length();
        n2 = s2.length();
        if(n1 != n2){
            return false;
        }
        freqs = new int[26];
        int i = 0;
        for(i = 0; i < n1; i++){
            freqs[s1.charAt(i) - 'a']++;
            freqs[s2.charAt(i) - 'a']--;
        }
        for(i = 0; i < 26; i++){
            if(freqs[i] != 0){
                return false;
            }
        }
        return true;
    }
}