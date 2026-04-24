import java.util.*;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            // 가장 가벼운 + 가장 무거운
            if (people[left] + people[right] <= limit) {
                left++; // 같이 태움
            }
            // 무거운 사람은 무조건 태움
            right--;
            boats++;
        }

        return boats;
    }
}