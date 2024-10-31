class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String[] items = s.trim().split(" ");

        for (String str : items) {
            System.out.println(str);
            if (!str.equals("") && str.indexOf(" ") == -1) {
                stack.push(str.trim());
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());

            if (!stack.isEmpty()) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}