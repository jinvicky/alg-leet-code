class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();

        // 현재 배열에서 가장 큰 값을 구한다. 
        int currentMax = 0;
        for(int c : candies) {
            currentMax = Math.max(currentMax, c);
        }

        // System.out.println(currentMax);

        // 추가 캔디를 더했을 때 currentMax보다 크면 true, 아니면 false를 추가한다.
        for(int c : candies) {
            if(c+ extraCandies >= currentMax) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }

        return answer;
    }
}