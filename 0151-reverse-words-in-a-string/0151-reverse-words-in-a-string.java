class Solution {
    public String reverseWords(String s) {
        String res = "";
        String temp = "";
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ' '){
                if(temp != ""){
                    if(res == ""){
                        res = temp + res;
                    }
                    else {
                        res = temp + " " + res;
                    }
                    temp = "";
                }
            }
            else {
                temp += s.charAt(i);
                if(i == n - 1){
                    if(res == ""){
                        res = temp + res;
                    }
                    else {
                        res = temp + " " + res;
                    }
                }
            }
        }
        return res;
    }
}