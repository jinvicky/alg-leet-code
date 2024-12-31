class Solution {
    public int differenceOfSums(int n, int m) {
        int notDividedSum = 0; 
        int dividedSum = 0;

        for(int i = 1; i <= n; i++) {
            if(i%m==0) {
                dividedSum+= i;
            } else {
                notDividedSum+= i;
            }
        }
        return notDividedSum - dividedSum;
    }
}