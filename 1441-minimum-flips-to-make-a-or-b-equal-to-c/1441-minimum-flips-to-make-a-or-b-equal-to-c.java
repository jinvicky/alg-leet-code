class Solution {
   private static String padWithZeros(String str, int maxLength) {
        // 길이가 짧은 문자열에 '0'을 붙임
        StringBuilder paddedString = new StringBuilder(str);
        // 필요한 만큼 '0'을 앞에 추가
        while (paddedString.length() < maxLength) {
            paddedString.insert(0, '0'); // 왼쪽에 '0' 추가
        }
        return paddedString.toString();
    }

    public int minFlips(int a, int b, int c) {
        int ans = 0;

        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String binC = Integer.toBinaryString(c);

        int maxLength = Math.max(binA.length(), Math.max(binB.length(), binC.length()));
        binA = padWithZeros(binA, maxLength);
        binB = padWithZeros(binB, maxLength);
        binC = padWithZeros(binC, maxLength);

        for (int i = 0; i < binC.length(); i++) {
            int ta = binA.charAt(i)-'0';
            int tb = binB.charAt(i)-'0';
            int tc = binC.charAt(i)-'0';

            if (tc==1) {
                if(ta + tb == 0) {
                    ans += 1;
                } 
            } else { // tc==0
                if(ta+tb ==1) {
                    ans+=1;
                } else if (ta+tb == 2) {
                    ans+=2;
                } else {
                    ans+=0;
                }
            }
        }
        return ans;
    }
}