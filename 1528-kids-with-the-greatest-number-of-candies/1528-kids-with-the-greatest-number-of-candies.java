class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        for(int i = 0; i < candies.length; i++) {
            int item = candies[i];
            // max = Math.max(max, item);
            max = item > max ? item : max;
            candies[i] = item + extraCandies;
        }

        List<Boolean> ans = new ArrayList<>();
        for(int j = 0; j < candies.length; j++) {
            ans.add(candies[j] >= max ? true : false);
        }
        return ans;
    }
}