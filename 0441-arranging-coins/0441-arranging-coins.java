class Solution {
    public int arrangeCoins(int n) {
        int row = 1;
        int coin = n;
        int count = 0;

        while(coin >= row) {
            coin -= row;
            row++;
            count++;
        }

        return count;
    }
}