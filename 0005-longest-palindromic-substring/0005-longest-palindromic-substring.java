class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 0 || n == 1){
            return s;
        }
        if(n == 2){
            if(s.charAt(0) == s.charAt(1))
            return s;
            else
            return s.substring(0,1);
        }
        int x = 0;
        int y = 0;
        int max = 0;
        String res = "";
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j >= i; j--){
                x = i;
                y = j;
                while(x < y){
                    if(s.charAt(x) == s.charAt(y)){
                        x += 1;
                        y -= 1;
                    }
                    else {
                        break;
                    }
                }
                if(x >= y){
                    if(j - i + 1 > max){
                        max = j - i + 1;
                        res = s.substring(i, j + 1);
                    }
                }
                else {
                    continue;
                }
            }
        }
        return res;
    }
}