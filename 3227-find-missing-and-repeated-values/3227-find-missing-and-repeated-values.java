class Solution {
   public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> map = new HashMap<>();
        int c = 1;
        int originalSum = 0;
        int gridSum = 0;
        
        int duplidateNum = -100;
        for(int[] items : grid) {
            for(int it : items) {
                int val = map.getOrDefault(it, 0);
                if(val+1 == 2) {
                    duplidateNum = it; // 중복 출력 . ok
                }
                map.put(it, ++val);

                gridSum+=it;
                originalSum+=c;
                c++;
            }
        }
        int omitNum = originalSum - (gridSum - duplidateNum);
        return new int[]{duplidateNum, omitNum};
    }
}