class Solution {
    public int findKthPositive(int[] arr, int k) {
        // 누락된 positive 개수
        int missingPositiveCount = arr[arr.length - 1] - arr.length;

        if(missingPositiveCount < k) { // arr 바깥에 정답이 있음
            int need = k - missingPositiveCount;
            return arr[arr.length - 1] + need;
        } else {

            int length = arr[arr.length - 1] + 1; // arr 최댓값 길이만큼의 배열 생성
            int[] temp = new int[length];

            for(int i = 0; i < arr.length; i++) {
                temp[arr[i]] = 1;
            }

            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < temp.length; i++) {
                if(temp[i] == 0) {
                    list.add(i);
                }
            }
            return list.get(k);

        }
    }
}