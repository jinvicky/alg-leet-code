class Solution {
    // private int binarySearch(int[] spells, int[] potions, long successFactor) {
    //     int left = 0; 
    //     int right = potions.length - 1;
    //     Arrays.sort(potions); // 누락시 time limit 초과

    //     while(left <= right) { // <= 하면 안되는건가?
    //             int middle = left + (right - left )/ 2;

    //             if(potions[middle] < successFactor) {
    //                 left = middle + 1;
    //             } else {
    //                 right = middle;
    //             }
    //         }
    //     return right;
    // }
    // public int[] successfulPairs(int[] spells, int[] potions, long success) {
    //     int[] answer = new int[spells.length];

    //     for(int i = 0; i < spells.length - 1; i++) {
    //         long successFactor = (success + spells[i] - 1) / spells[i]; // 이유 알아내야함
    //         int startPosition = binarySearch(spells, potions, successFactor);
    //         answer[i] = potions.length - startPosition;
    //     }

    //     return answer;
    // }

    private int binarySearch(int[] potions, long successFactor) {
            int left = 0;
            int right = potions.length;

            while(left < right) { // <= 하면 안되는건가?
                int middle = left + (right - left )/ 2;

                if(potions[middle] < successFactor) {
                    left = middle + 1;
                } else {
                    right = middle;
                }
            }
            return right; // 왜 end값을 반환하는 거지? start는 범위를 넘어버릴까봐 그런가?
            // 이 반환값이 시작위치가 된다.
        }

        public int[] successfulPairs(int[] spells, int[] potions, long success)
        {
            Arrays.sort(potions);
            int[] result = new int[spells.length];

            for(int i = 0; i < spells.length; i++) {
                long successFactor = (success + spells[i] - 1) / spells[i]; // 이유 알아내야함
                int startPosition = binarySearch(potions, successFactor);
                result[i] = potions.length - startPosition;
            }
            return result;
        }
}