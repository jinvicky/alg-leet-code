class Solution {
    // 내 정답
    // public int[] dailyTemperatures(int[] temperatures) {
    //     Stack<List<Integer>> stack = new Stack<>();
    //     int[] result = new int[temperatures.length];
    //     for (int i = 0; i < temperatures.length; i++) {
    //         int tmpt = temperatures[i];

    //         while (!stack.isEmpty() && stack.peek().get(0) < tmpt) {
    //             List<Integer> pop = stack.pop();
    //             result[pop.get(1)] = i - pop.get(1); // 1-0 하면 30, 1 들어가겠지
    //         }
    //         stack.push(List.of(tmpt, i));
    //     }
    //     return result;
    // }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int index = stk.pop();
                res[index] = i - index;
            }
            stk.push(i);
        }
        return res;
    }
}
