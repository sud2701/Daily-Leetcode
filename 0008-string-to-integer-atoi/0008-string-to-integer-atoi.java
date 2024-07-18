class Solution {
    public int myAtoi(String s) {
        boolean positive = true;
        boolean number_started = false;
        int n = s.length();
        double result = 0;
        char ch;
        for(int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if(ch == ' '){
                if(number_started){
                    break;
                }
                continue;
            }
            else if(ch == '-'){
                if(number_started){
                    break;
                }
                positive = false;
                number_started = true;
            }
            else if(ch == '+'){
                if(number_started){
                    break;
                }
                positive = true;
                number_started = true;
            }
            else if(ch >= 48 && ch <= 57) {
                result = (double) (result * 10 + (ch - 48));
                number_started = true;
            }
            else {
                break;
            }
        }
        if(positive) {
            if(result > Math.pow(2, 31) - 1){
                return (int)(Math.pow(2, 31) - 1);
            }
            return (int) result;
        }
        if(result < -1 * Math.pow(2, 31)){
            return (int)(-1 * Math.pow(2, 31));
        }
        return (int) (-1 * result);
    }
}