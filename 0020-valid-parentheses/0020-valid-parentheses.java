class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                // } 또는 ] 또는 )인 경우
                char peek = stack.peek();

                if (peek == '{' && s.charAt(i) == '}') {
                    stack.pop();
                } else if (peek == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else if (peek == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
            return stack.isEmpty() ? true : false;
    }
}