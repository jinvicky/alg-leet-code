class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n];

        if(n < 3) {
            switch(n) {
                case 1: 
                    return 1;
                case 2:
                    return 2;
            }
        }

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for(int i = 3; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n-1];
    }
}