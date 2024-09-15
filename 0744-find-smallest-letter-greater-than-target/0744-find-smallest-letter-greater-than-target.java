class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // 이진 검색을 수행
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 현재 문자가 목표 문자보다 작거나 같으면 오른쪽 절반을 검색
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                // 현재 문자가 목표 문자보다 크면 왼쪽 절반을 검색
                end = mid - 1;
            }
        }

        // start가 배열 길이를 초과하면 첫 번째 문자를 반환
        return start < letters.length ? letters[start] : letters[0];
    }
}