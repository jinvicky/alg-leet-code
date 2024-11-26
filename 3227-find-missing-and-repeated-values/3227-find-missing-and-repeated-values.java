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
        System.out.println("sum = " + originalSum); // 원래 값이어야 한다.
        System.out.println("duplidateNum = " + duplidateNum);
        System.out.println("grid = " + gridSum);
        // duplicateNum을 sum에서 뺀다. 
        System.out.println("(gridSum - duplidateNum) = " + (gridSum - duplidateNum));

        System.out.println("originalSum = " + (originalSum - (gridSum - duplidateNum)));

        int omitNum = originalSum - (gridSum - duplidateNum);
        return new int[]{duplidateNum, omitNum};
    }
}