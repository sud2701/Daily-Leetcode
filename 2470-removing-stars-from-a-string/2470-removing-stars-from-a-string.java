class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch == '*'){
                if(stack.empty()){
                    continue;
                }
                else {
                    stack.pop();
                }
            }
            else {
                stack.push(ch);
            }
        }
        String res = "";
        while(!stack.empty()){
            res = String.valueOf(stack.pop()) + res;
        }
        return res;
    }
}