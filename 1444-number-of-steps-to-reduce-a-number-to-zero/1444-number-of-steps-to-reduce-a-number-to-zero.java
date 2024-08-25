class Solution {
    public int numberOfSteps(int num) {
        int output = 0;
        int inputNum = num;

        while(inputNum > 0) {
            if(inputNum == 0) {
                break;
            }

            if(inputNum % 2 == 0) {
                inputNum /= 2;
                output++;
            } else {
                inputNum -= 1;
                output++;
            }
        }
        return output;
    }
}