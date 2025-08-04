class Solution {
    public boolean isPalindrome(String s) {
        if (s.equals(" "))
            return true;

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb.toString());
        return sb.toString().equals(sb.reverse().toString());
    }
}