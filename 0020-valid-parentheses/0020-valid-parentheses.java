class Solution {
    public boolean isValid(String s) {
        /**
            스택이 비었다면 true, 차있다면 false다.
            괄호들에 대해서는 case 문으로 정립한다. 
         */

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // 좌측 괄호면 무조건 추가한다. 
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false; // 우측 괄호가 있는데 스택이 비었으면 false 
                char peek = stack.peek();
                if(peek == '(' && c  == ')') {
                    stack.pop();
                } else if (peek == '{' && c == '}') {
                    stack.pop();
                } else if (peek == '[' && c == ']') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }
}