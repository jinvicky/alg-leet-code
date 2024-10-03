class Solution {
    public void reverseString(char[] s) {
        int left = 0; 
        int right = s.length -1; 

        while(left <= right) {
            // left와 right을 서로 바꾼다. 그리고 left++; right--;

            char t = 'a';

            t = s[left];
            s[left] = s[right];
            s[right] = t;

            left++;
            right--;
        }
    }
}