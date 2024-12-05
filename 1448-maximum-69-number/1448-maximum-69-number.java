class Solution {
//      public int maximum69Number(int num) {
//         int count = 0; // num의 자릿수
//         int n = num;
//         // 0. 9996의 자릿수를 출력한다. ok
//         while (n > 0) {
//             count++;
//             n /= 10;
//         }

//         // 1. 9996을 숫자 배열로 출력해본다. ok
//         int[] arr = new int[count];
//         boolean fliped = false;
//         int fToL1 = 0;
//         for (int i = count - 1; i >= 0; i--) {
//             int d = num / (int) Math.pow(10, i);

//             boolean flipRequired = d != 9 && !fliped;
//             if (flipRequired) {
//                 arr[fToL1] = 9;
//                 fliped = true;
//             } else {
//                 arr[fToL1] = d;
//             }
//             num = num - (d * (int) Math.pow(10, i)); // WARN:: d=9식으로 직접적으로 건드리면 여기서 num 갱신에 실패한다.
//             fToL1++;
//         }

//         // 이제 다 더해야 한다.
//         int maxNumber = 0;
//         int fToL = 0;
//         for(int j = count-1; j >= 0; j--) {
//             int zeros = (int) Math.pow(10, j);
// //            System.out.println("zeros = " + zeros);
            
//             maxNumber+= zeros * arr[fToL];
// //            System.out.println("zeros+arr[fToL] = " + zeros * arr[fToL]);
//             fToL++;

//         }
//         return maxNumber;
//     }

public int maximum69Number(int num) {
    // Step 1: Convert the number to a character array for easy manipulation.
    char[] digits = String.valueOf(num).toCharArray();

    // Step 2: Traverse the digits and flip the first '6' to '9'.
    for (int i = 0; i < digits.length; i++) {
        if (digits[i] == '6') {
            digits[i] = '9';
            break; // Only flip the first '6'.
        }
    }

    // Step 3: Convert the modified character array back to an integer.
    return Integer.parseInt(new String(digits));
}
}