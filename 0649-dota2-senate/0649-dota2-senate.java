// class Solution {
//     public String predictPartyVictory(String senate) {
//         Queue<Integer> rad = new LinkedList<>();
//         Queue<Integer> dir = new LinkedList<>();
//         int n = senate.length();

//         for(int i = 0; i < n; i++) {
//             if(senate.charAt(i) == 'R') {
//                 rad.add(i);
//             } else {
//                 dir.add(i);
//             }
//         }

//         while(!rad.isEmpty() && !dir.isEmpty()) {
//             if(rad.peek() < dir.peek()) {
//                 rad.add(n++);
//             } else {
//                 dir.add(n++);
//             }
//             rad.poll();
//             dir.poll();
//         }

//         return rad.isEmpty() ? "Dire" : "Radiant";
//     }
// }

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> queR = new LinkedList<>();
        Queue<Integer> queD = new LinkedList<>();

        String[] arrStr = senate.split("");
        int strLen = arrStr.length;

        for(int i = 0; i < strLen; i++) {
            if(arrStr[i].equals("R")) {
                queR.offer(i);
            } else {
                queD.offer(i);
            }
        }

        while(!queR.isEmpty() && !queD.isEmpty()) {
            if(queR.peek() > queD.peek()) {
                queR.poll();
                queD.offer(queD.poll() + strLen);
            } else {
                queD.poll();
                queR.offer(queR.poll() + strLen);
            }
        }

        return queD.isEmpty() ? "Radiant" : "Dire";
    }
}