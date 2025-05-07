class Solution {
    private int recursive(int number) {
        int total = 0;

        while (number > 0) {
            total += number  % 10;
            number /= 10;
        }

        if(total < 10) return total;
        return recursive(total);
    }
    public int addDigits(int num) {
        return num < 10 ? num : recursive(num);
    }
}