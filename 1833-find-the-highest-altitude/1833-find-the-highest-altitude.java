class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;

        for(int i = 1; i < gain.length; i++) {
            gain[i] += gain[i-1];

            System.out.println(gain[i]);
            max = Math.max(max, gain[i]);
        }
        return Math.max(gain[0], max);
    }
}