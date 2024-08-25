class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int value = i + 1;
            if(value % 3 == 0) { // 3으로 나뉜다
                result.add("Fizz");
                if(value % 5 == 0) {
                    result.set(i, "FizzBuzz");
                }
            } else {
                if(value % 5 == 0) {
                    result.add("Buzz");
                } else {
                    // 그냥 숫자
                    result.add(String.valueOf(value));
                }
            }
        }
        return result;
    }
}