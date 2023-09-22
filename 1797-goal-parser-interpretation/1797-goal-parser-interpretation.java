class Solution {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int n = command.length();
        char ch;
        for(int i = 0; i < n; i++){
            ch = command.charAt(i);
            if(ch == ')'){
                if(command.charAt(i - 1) == 'l'){
                    result.append("al");
                }
                else if(command.charAt(i - 1) == '('){
                    result.append("o");
                }
            }
            else if(ch == 'G'){
                result.append("G");
            }
        }
        return result.toString();
    }
}