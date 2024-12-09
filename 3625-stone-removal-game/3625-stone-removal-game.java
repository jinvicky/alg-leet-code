class Solution {
    
    public boolean canAliceWin(int n) {
        if (n < 10) {
            return false; // 첫판에 앨리스가 10개를 치울 수 없다면 앨리스는 진다.
        }

        int stone = 10;
        int i = 0;
        while (n >= 0) {
            n -= stone;
            stone--;
            i++;
        }
        boolean aliceTurn = i % 2 != 0; // 1,3,5,7,9

        if (aliceTurn) {
            return false;
        }
        return true;
    }
}