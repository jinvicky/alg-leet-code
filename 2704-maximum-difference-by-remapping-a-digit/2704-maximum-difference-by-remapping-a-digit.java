import java.util.*;
import java.math.*;
import java.io.*;

class Solution {
    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        char[] original = numStr.toCharArray();

        // ===== MAX: 바꿀 첫 문자 찾기 (첫 != '9')
        char maxTarget = ' ';
        for (char c : original) {
            if (c != '9') {
                maxTarget = c;
                break;
            }
        }

        // 'maxTarget'을 '9'로 바꾸기
        StringBuilder maxSb = new StringBuilder();
        for (char c : original) {
            if (c == maxTarget)
                maxSb.append('9');
            else
                maxSb.append(c);
        }
        int max = Integer.parseInt(maxSb.toString());

        // ===== MIN: 바꿀 첫 문자 찾기 (첫 != '0')
        char minTarget = ' ';
        for (char c : original) {
            if (c != '0') {
                minTarget = c;
                break;
            }
        }

        // 'minTarget'을 '0'으로 바꾸기
        StringBuilder minSb = new StringBuilder();
        for (char c : original) {
            if (c == minTarget)
                minSb.append('0');
            else
                minSb.append(c);
        }
        int min = Integer.parseInt(minSb.toString());

        return max - min;
    }

}