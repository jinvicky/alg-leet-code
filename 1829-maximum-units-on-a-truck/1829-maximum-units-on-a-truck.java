class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int max =0;
        Arrays.sort(boxTypes, (a,b) -> {
            if(a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(b[1], a[1]);
        }); // ok

        for(int[] units : boxTypes) {
            int amount = units[0];
            int value = units[1];

            if(truckSize <= 0) return max; // 트럭이 꽉 차서 현재의 답을 반환

            // truckSize - amount를 할건데 이게 -면 안된다. 
            if(truckSize > amount) {
                max += amount * value;
                truckSize -= amount;
            } 
            else {
                max += truckSize * value;
                truckSize -= truckSize;
            }

        }


        return max;        
    }
}