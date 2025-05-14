class Solution {
    public String largestOddNumber(String num) {
        // 나올수 있는 홀수 중 가장 큰 문자열을 반환한다. 
        char[] cArr = num.toCharArray();


        for(int i = cArr.length - 1; i >= 0; i--) {
            if(cArr[i] % 2 == 0) {
                // 아무것도 하지 않는다. 
            } else { // 홀수라면 기존 max값
                return num.substring(0, i+1);
            }
        }
        return new String();
    }
}