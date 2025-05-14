// class Solution {
//     public List<Integer> pancakeSort(int[] arr) {
        
//         List<Integer> ans = new ArrayList<>();

//         for(int valueToSort = arr.length; valueToSort > 0; valueToSort--) {
//             int index = this.find(arr, valueToSort);

//             if(index == valueToSort - 1) {
//                 continue;
//             }

//             if(index != 0) {
//                 ans.add(index + 1);
//                 this.flip(arr, index+1);
//             }

//             ans.add(valueToSort);
//             this.flip(arr, valueToSort);
//         }

//         return ans;
//     }

//     protected void flip(int[] sublist, int k) {
//         int i = 0; 
//         while (i < k / 2) {
//             int temp = sublist[i];
//             sublist[i] = sublist[k - i - 1];
//             sublist[k-i-1] = temp;
//             i+= 1;
//         }
//     }

//     protected int find(int[] a , int target) {
//         for(int i = 0; i < a.length; i++) {
//             if (a[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
import java.util.*;

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int valueToSort = arr.length; valueToSort > 0; valueToSort--) {
            // 1. valueToSort의 현재 인덱스 찾기
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == valueToSort) {
                    index = i;
                    break;
                }
            }

            // 2. 이미 제자리에 있으면 패스
            if (index == valueToSort - 1) continue;

            // 3. 먼저 index까지의 앞부분을 뒤집어 valueToSort를 맨 앞으로 가져옴
            if (index != 0) {
                ans.add(index + 1); // 뒤집기 위치 기록
                int left = 0, right = index;
                while (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }

            // 4. 그 다음, valueToSort까지의 범위를 뒤집어 맨 뒤로 이동
            ans.add(valueToSort);
            int left = 0, right = valueToSort - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return ans;
    }
}
