class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        if(k <= numOnes) {
            return k;
        } else if (k <= numOnes + numZeros) {
            return numOnes;
        } else if (k <= numOnes + numZeros + numNegOnes) {
            // 셋을 합치되, 최대한 음수를 적게 선택
            int required = -1 * (k - numOnes - numZeros);
            return numOnes + required;
        } else {
            return numOnes + (-1 * numNegOnes);
        }
        
    }
}