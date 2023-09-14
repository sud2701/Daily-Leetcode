class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if(n > h){
            return -1;
        }
        char start = needle.charAt(0);
        int i = 0;
        int j = 0;
        ArrayList<Integer> start_indices = new ArrayList<Integer>();
        for(i = 0; i < h; i++){
            if(haystack.charAt(i) == start){
                start_indices.add(i);
            }
        }
        int occurences = start_indices.size();
        for(i = 0; i < occurences; i++){
            j = start_indices.get(i);
            if(j + n > h){
                continue;
            }
            else if(haystack.substring(j, j + n).equals(needle)){
                return j;
            }
        }
        return -1;
    }
}