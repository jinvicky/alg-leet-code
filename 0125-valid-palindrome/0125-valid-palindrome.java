class Solution {
    public boolean isPalindrome(String s) {
        /**
           변환하고 바꾸면 늦는데.. 
         */
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                sb.append(c);
            }
            if(Character.isAlphabetic(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = sb.toString().length() -1;

        while (left <= right) {
            System.out.println(sb.toString().charAt(left));
            System.out.println(sb.toString().charAt(right));
            if(sb.toString().charAt(left) != sb.toString().charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}