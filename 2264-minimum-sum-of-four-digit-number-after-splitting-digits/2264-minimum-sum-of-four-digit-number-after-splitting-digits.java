class Solution {
    public int minimumSum(int num) {
        int answer =0;
        String s = num + "";
        char[] cArr = s.toCharArray();

        Arrays.sort(cArr);

        int new1 = (cArr[0] - '0')* 10 + (cArr[3] - '0');
        int new2 = (cArr[1] - '0')* 10 + (cArr[2] - '0');
      

        return new1+new2;
    }
}