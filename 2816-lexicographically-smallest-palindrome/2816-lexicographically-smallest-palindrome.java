class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] charArr = s.toCharArray();
        int left = 0;
        int right = charArr.length -1;

        while(left <= right) {
            System.out.println(charArr[left] + " and " + charArr[right]);
            if(charArr[left] != charArr[right]) {
                if(charArr[left] > charArr[right]) {
                    charArr[left] = charArr[right];   
                } else {
                    charArr[right] = charArr[left];
                }
            }
            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : charArr) {
                sb.append(c);
        }
        return sb.toString();
    }
}