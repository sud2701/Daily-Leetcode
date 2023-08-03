class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer> ();
        int m = ransomNote.length();
        int n = magazine.length();
        if(m > n){
            return false;
        }
        char key;
        int value, i;
        for(i = 0; i < n; i++){
            key = magazine.charAt(i);
            if(map.containsKey(key)){
                value = map.get(key);
                map.replace(key, value + 1);
            }
            else {
                map.put(key,1);
            }
        }
        for(i = 0; i < m; i++){
            key = ransomNote.charAt(i);
            if(map.containsKey(key)){
                value = map.get(key);
                if(value == 0){
                    return false;
                }
                map.replace(key, value - 1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}