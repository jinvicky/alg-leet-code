class Solution {
    public String maximumNumber(String num, int[] change) {
        char[] arr = num.toCharArray();
        char[] oxArr = new char[arr.length];

        StringBuilder sb = new StringBuilder();
        int replaceIndex = -999;
        for(int i = 0; i < arr.length; i++) {
            int v = arr[i] - '0';

            if(v == change[v]) { // 
                if (i == 0 || oxArr[i-1] == 'O') { // 인접을 유지하기로 한다.
                    oxArr[i] = 'O';
                } else {
                    oxArr[i] = 'X';
                }
                sb.append(v);
            } else if (v < change[v]) { //  인접상태일때만 교체할 수 있다. 
                if (i==0 || oxArr[i-1] == 'O') {
                    oxArr[i] = 'O';
                    sb.append(change[v]);
                    replaceIndex = i;
                } else {
                    oxArr[i] = 'X';
                    sb.append(v);
                }

            } else { // v > change[v] 인접상태라면 폐기하고 인접이 아니었다면 그냥 허용해야 하는데
                sb.append(v);

                oxArr[i] = replaceIndex == -999 ? 'O' : 'X';
                // 쭉 인접이 아니었다가 인접이 발생한 경우 어떻게 할 것인지?
            }

        }
        return sb.toString();
    }
}
// 인접상태인지 어떻게 체크할 것인가?