class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = Arrays.stream(quantities).max().getAsInt();

        while(left < right) {
            int mid = (left+right) / 2;

            if(canDo(n, mid, quantities)) {
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }

    public static boolean canDo(int n, int maxPerStore, int[] quantities) {
        int required = 0;
        for(int q : quantities) {
            required += (q + maxPerStore - 1) / maxPerStore;
        }
        return  required <= n;
    }
}