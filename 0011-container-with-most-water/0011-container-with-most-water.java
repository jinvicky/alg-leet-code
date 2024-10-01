class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            System.out.println("right and left " + right + ": " + left);

            System.out.println(height[left] +" and " + height[right]);
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}