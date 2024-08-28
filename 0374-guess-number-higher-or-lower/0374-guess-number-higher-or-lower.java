/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 0;
        int end = n;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            int guess = guess(mid);

            if(guess == 0) {
                return mid;
            }

            if(guess > 0) { // 내 추측이 더 낮다
                start = mid + guess;
            }

            if(guess < 0) { // 내 추측이 더 높다.
                end = mid + guess;
            }
        }
        return -1;
    }
}