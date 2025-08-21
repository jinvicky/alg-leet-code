class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int area = 0;

        while (start < end) {
            int y = Math.min(height[start], height[end]); // y축은 더 작은 값으로 설정
            int x = Math.abs(start - end);
            int calculatedArea = x * y;
            area = Math.max(area, calculatedArea);

            if (height[start] <= height[end])
                start++;
            else
                end--;
        }

        return area;
    }
}