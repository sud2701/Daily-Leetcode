class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int n = tokens.length;
        int a;
        int b;
        for(int i = 0; i < n; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                a = stack.pop();
                b = stack.pop();
                if(tokens[i].equals("+")){
                    stack.push(b + a);
                }
                if(tokens[i].equals("-")){
                    stack.push(b - a);
                }
                if(tokens[i].equals("*")){
                    stack.push(b * a);
                }
                if(tokens[i].equals("/")){
                    stack.push(b / a);
                }
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}