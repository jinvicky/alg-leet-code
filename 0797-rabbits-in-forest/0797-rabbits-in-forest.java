class Solution {
    
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> rbMap = new HashMap<>();
        Arrays.sort(answers);

        int minRabbits = 0; // 최소 토끼는 몇마리인가
        for (int i = answers.length - 1; i >= 0; i--) { // 정답이 큰 토끼부터 계산한다.
            if (answers[i] == 0) {
                // 유일 토끼는 맵에 저장하지 않고 바로 정답에 더한다.
                minRabbits++;
                continue;
            }
            int key = answers[i] + 1;

            int prevValue = rbMap.getOrDefault(key, 0);
            if(prevValue == key) {
                minRabbits+=key; // 그룹의 토끼수만큼 더하고 해당 그룹은 삭제한다.
                rbMap.remove(key);
            }
            rbMap.put(key, rbMap.getOrDefault(key, 0) + 1);
        }

        System.out.println("rbMap = " + rbMap);

        for(Map.Entry<Integer, Integer> m : rbMap.entrySet()) {
            minRabbits+=m.getKey();
        }
        return minRabbits;
    }
}