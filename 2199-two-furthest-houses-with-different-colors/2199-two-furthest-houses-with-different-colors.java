class Solution {
    public int maxDistance(int[] colors) {

        if(colors.length == 2  && colors[0] != colors[1]) return 1;

        int left = 0; 
        int right = colors.length - 1;

        int maxDistance = 0;
        while(left < right) {
            if(colors[left] != colors[right]) {
                maxDistance = Math.abs(left- right);
                break;
            }
            right--;
        }

        left = 0;
        right = colors.length - 1;
        int maxDist2 = 0;
        while(left < right) {
            if(colors[left] != colors[right]) {
                maxDist2 = Math.abs(right - left);
                break;
            }
            left++;
        }
        
        return Math.max(maxDistance, maxDist2);
    }
}