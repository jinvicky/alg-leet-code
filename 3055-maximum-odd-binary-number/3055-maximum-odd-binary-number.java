class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr = s.toCharArray();
        int oneCount = 0;

        for(char c : arr) {
            if (c == '1') oneCount++;
        }

        StringBuilder sb = new StringBuilder();

         // 앞에 oneCount - 1개의 1
        for (int i = 0; i < oneCount - 1; i++) {
            sb.append('1');
        }

        // 중간에 0으로 채우기: 총 길이 - oneCount
        for (int i = 0; i < s.length() - oneCount; i++) {
            sb.append('0');
        }

        sb.append('1');
       

        return sb.toString();
    }
}