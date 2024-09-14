class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1;
        int right = arr.length - 1; // 양끝은 절대 피크가 되지 않을거니까

        int biggest = 1;

        for(int i = left; i < right; i++) {

            if(arr[biggest] <= arr[i]) {
                biggest = i;
            } else {
                // i++;
            }
        }
        return biggest;
    }
}