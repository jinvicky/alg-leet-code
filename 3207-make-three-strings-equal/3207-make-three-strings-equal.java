class Solution {
   private boolean isSame(char ch1, char ch2) {
        return ch1 == ch2;
    }

   public int findMinimumOperations(String s1, String s2, String s3) {
        int minLength = Math.min(s1.length(), Math.min(s2.length(), s3.length()));

        int slice = -1;
        for (int i = 0; i < minLength; i++) {
            final boolean IS_DIFF = !(isSame(s1.charAt(i), s2.charAt(i)) && isSame(s2.charAt(i), s3.charAt(i)));

            if(IS_DIFF) {
                if(i==0) return -1;

                if(i <= minLength-1) {
//                    System.out.println("IS_DIFF = " + IS_DIFF);
                    // oby, obz, obf가 해당한다.
                    slice = i;
                    break;
                } else {
                    slice = minLength;
                }
            }
        }
        if(slice == -1) {
            slice = minLength;
        }
        // 슬라이스가 1이 나와야 하는데 2가 나온다. 
//        System.out.println("slice = " + slice);

//        System.out.println("(s1.length() - slice) = " + (s1.length() - slice));
//        System.out.println("(s1.length() - slice) = " + (s2.length() - slice));
//        System.out.println("(s1.length() - slice) = " + (s3.length() - slice));
        return (s1.length() - slice) + (s2.length() - slice) + (s3.length() - slice);
    }
}