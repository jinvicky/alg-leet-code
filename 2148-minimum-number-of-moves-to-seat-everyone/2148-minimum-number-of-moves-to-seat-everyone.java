import java.math.*;
import java.util.*;
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int n = seats[seats.length - 1];
        int[] chairCnt = new int[n + 1]; // 1부터 위치로 계산

        for(int i = 0; i < seats.length; i++) {
            int chairIdx = seats[i];
            chairCnt[chairIdx]++; 
        }

        // 1부터 탐색 
        int seatIdx = 0;
        int answer = 0; // 
        for(int j = 0; j < students.length; j++){
            while (true) {
                if(chairCnt[seatIdx] > 0) { // 앉을 수 있다면
                System.out.println(chairCnt[seatIdx] 
                + " and " + seatIdx);
                    int stdPos = students[j]; // 현재 학생의 위치
                    // int seatPos = seats[seatIdx]; // 현재 의자의 위치

                    answer += Math.abs(stdPos - seatIdx);

                    chairCnt[seatIdx]--; // 현재위치의 의자개수 감소
                    break;
                } else {
                    seatIdx++; // 다음 의자를 탐색
                }
            }
        }
        return answer;
    }
}