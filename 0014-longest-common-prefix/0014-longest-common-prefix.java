class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0){
            return "";
        }
        if(n == 1){
            return strs[0];
        }
        StringBuilder res = new StringBuilder("");
        char curr;
        for(int i = 0; i < strs[0].length(); i++){
            curr = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].length() > i && strs[j].charAt(i) == curr){
                    continue;
                }
                else {
                    return res.toString();
                }
            }
            res.append(String.valueOf(curr));
        }
        return res.toString();
    }
}