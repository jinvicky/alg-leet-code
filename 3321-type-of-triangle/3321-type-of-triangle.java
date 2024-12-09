class Solution {
    
    public String triangleType(int[] nums) {
        // 삼각형이 될 수 없는 경우는 언제지?
        if (nums[0] == nums[1] && nums[1] == nums[2]) { // 세 변이 모두 동일한 정삼각형
            return "equilateral";
        }

        if (isValidTriangle(nums[0], nums[1], nums[2])) {
            if (hasTwoSameSides(nums[0], nums[1], nums[2])) {
                return "isosceles";
            }
            return "scalene";
        }
        return "none";
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        // 세 수를 가지고 세 조합을 만들어서 두 값의 합이 다른 나머지 하나보다 큰지 확인한다.
        boolean valid1 = a + b > c;
        boolean valid2 = b + c > a;
        boolean valid3 = a + c > b;
        return valid1 && valid2 && valid3;
    }

    private static boolean hasTwoSameSides(int a, int b, int c) {
        return a == b || a == c || b == c;
    }

}