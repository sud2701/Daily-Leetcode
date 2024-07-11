class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        int n = s.length();
        boolean flag = true;
        for(int i = 0; i < n; i++) {
            switch(s.charAt(i)) {
                case ')': flag = false;
                break;
                default: stack.push(s.charAt(i));
                break;
            }
            if(!flag) {
                ArrayList<Character> reverse = new ArrayList<Character>();
                char ch;
                while(true) {
                    ch = stack.pop();
                    if(ch != '('){
                        reverse.add(ch);
                    }
                    else {
                        break;
                    }
                }
                for(char c: reverse) {
                    stack.push(c);
                }
                flag = true;
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.empty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}