class Solution {
    // private boolean isEnd(char[] chars, int i) {
    //     // 대체 언제 알파벳이 끝났다는 것을 알까?
    //     // 1. 내가 chars.length -1 까지 갔을 때, 내 다음 문자가 없을때지.
    //     if (i == chars.length - 1) {
    //         return true;
    //     }
    //     // 2. 내 다음 문자가 나와 다를 때
    //     if (chars[i] != chars[i + 1]) { // 이래도 위에서 length-1일 때를 걸렀으니 괜찮겠지
    //         return true;
    //     }
    //     return false;
    // }

    // public int compress(char[] chars) {
    //     int size = 0;
    //     Map<Character, Integer> map = new HashMap<>();

    //     for (int i = 0; i < chars.length; i++) {
    //         char currentChar = chars[i];
    //         map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
    //         if (isEnd(chars, i)) {
    //             int count = map.get(currentChar);
    //             // System.out.println("count = " + count);
    //             if (count == 1) {
    //                 chars[size++] = currentChar;
    //             } else {
    //                 chars[size++] = currentChar;
    //                 String toStr = String.valueOf(count);
    //                 for (int k = 0; k < toStr.length(); k++) {
    //                     chars[size++] = toStr.charAt(k);
    //                 }
    //             }
    //             map.remove(currentChar);
    //         } else {
    //             // map.put(currentChar, map.getOrDefault(currentChar, 0) + 1); // 얘 때문에 3 3 5 나옴
    //         }
    //     }
    //     return size;
    // }

     public int compress(char[] chars) {
        int count = 1;
        if (chars.length == 1) {
            return 1;
        }
        int j=1;
        for (int i=1;i<chars.length; i++) {
            if (chars[i] == chars[i-1]) {
                count++;
                continue;
            }
            chars[j] = chars[i];
            if (count ==1) {
                j=j+1;
                continue;
            }
            
            if (count > 1) {
                if (count > 9) {
                    String val = String.valueOf(count);
                    for (char c : val.toCharArray()) {
                        chars[j++] = c;
                    }
                } else {
                    chars[j++] = Character.forDigit(count, 10);
                }
            }

            chars[j++] = chars[i];
            count = 1;
        } 
        if (count > 9) {
                    String val = String.valueOf(count);
                    for (char c : val.toCharArray()) {
                        chars[j++] = c;
                    }
                } else if (count > 1){
                    chars[j++] = Character.forDigit(count, 10);
                } 
            return j;
    }

}